#!/bin/bash


## Get data first
###------------
###Setup you environment!!! or script will not work!
###------------
##
## Change below to your directory structure!
export LOC=/root/IAC-Bigdata/week3/setup_mysql/airlines
###-----------
### End Environment 
###-----------


###Don't change anything else!!!


export M_CREATE=`mysql < create_airlines.sql`
export M_CREATE_TABLES=`mysql < create_tables_airlines.sql`

rm carriers.csv
rm airports.csv

wget http://stat-computing.org/dataexpo/2009/carriers.csv
wget http://stat-computing.org/dataexpo/2009/airports.csv

echo "check if ontime file exists and uncompress "
check_ontime=`ls 2008.csv|wc -l`
echo $check_ontime

if [ $check_ontime = 1 ]; then
echo "file already exists....moving to next step"
else 
wget http://stat-computing.org/dataexpo/2009/2008.csv.bz2
echo " uncompress bz2 file"

bunzip2 2008.csv.bz2
fi


get_count=`ls *.csv $LOC |wc -l`
if [ get_count < 3 ]; then
echo " datafiles are missing"
else 

echo "=========================="
echo "creating database"
echo ""
## Create Airlines database MySQL
#/usr/bin/mysql < create_airlines.sql
$M_CREATE
$M_CREATE_TABLES
mysql <<EOF
use airlines;

LOAD DATA LOCAL INFILE '$LOC/2008.csv' INTO TABLE ontime FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'  IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '$LOC/carriers.csv' INTO TABLE carriers FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'  IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '$LOC/airports.csv' INTO TABLE airports FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'  IGNORE 1 LINES;



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
