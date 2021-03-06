#!/bin/bash
####################################################
# Version: 1.2
# Script Name: 1_drop_create_airlines_tables.bash
# Date created: 3/13/2016
# Purpose : Creates Employees database in MySQL
# Author: Abdul Khan
# History:
#       v1.0 - 03-20-2016 Initial script created
#       v1.1 - 01-13-2017 Fixed bugs related to missing checks for compress data file
#       v1.1 - 01-13-2017 Fixed bugs related variable path "LOC"
####################################################


## Get data first
###------------
###Setup your environment!!! or script will not work!
###------------
##
## Change below to your directory structure!
export LOC=$PWD
###-----------
### End Environment
###-----------


###Don't change anything else!!!


export M_CREATE=`mysql < create_airlines.sql`
export M_CREATE_TABLES=`mysql < create_tables_airlines.sql`

rm carriers.csv
rm airports.csv

wget http://stat-computing.org/dataexpo/2009/carriers.csv
#wget http://stat-computing.org/dataexpo/2009/airports.csv
wget https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat

cd $LOC
mv carriers.csv carriers.csv1
#mv airports.csv airports.csv1
sed 's/\"//g' carriers.csv1 > carriers.csv
sed 's/\"//g'  airports.dat >  airports.csv 
echo "check if ontime file exists and uncompress "
check_ontime=`ls 2008.csv|wc -l`
echo ""
echo ""
echo "Ontime file count = $check_ontime"

echo ""
echo ""
if [ $check_ontime = 1 ]; then
echo ""
echo ""
echo "file already exists....moving to next step"
echo ""
echo ""
else
wget http://stat-computing.org/dataexpo/2009/2008.csv.bz2
echo ""
echo ""
echo " uncompress bz2 file"

echo ""
echo ""
bunzip2 2008.csv.bz2
fi

cd $LOC
get_count=`ls *.csv |wc -l`
echo ""
echo ""
echo "CSV files count --- $get_count ---"
echo ""
echo ""
if [ ${get_count} -lt 3 ]  ; then
echo " datafiles are missing"
exit 0;
else

echo ""
echo ""
echo "=========================="
echo "creating database"
echo ""
echo ""
## Create Airlines database MySQL
#/usr/bin/mysql < create_airlines.sql
$M_CREATE
$M_CREATE_TABLES
mysql <<EOF
use airlines;

LOAD DATA LOCAL INFILE '$LOC/2008.csv' INTO TABLE ontime FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'  IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '$LOC/carriers.csv' INTO TABLE carriers FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n'  IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '$LOC/airports.csv' INTO TABLE airports FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n'  IGNORE 1 LINES;



EOF

echo "verify tables count"

mysql <<EOF
use airlines;
show tables;

select count(*) from airlines.ontime;
select count(*) from airlines.carriers;
select count(*) from airlines.airports;

EOF
fi

