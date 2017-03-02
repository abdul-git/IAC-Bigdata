#!/bin/bash

####################################################
# Version: 1.2
# Script Name: 1_create_database_employees_tables.sh
# Date: 1/13/2017
# Purpose : Creates Employees database in MySQL
# Author: Abdul Khan
# History:
# 	v1.0 - 03-20-2016 Initial script created
# 	v1.1 - 01-13-2017 Fixed bugs related to missing checks for compress data file
# 	v1.2 - 01-13-2017 Fixed bugs related to path LOC
####################################################

## Get data first
###------------
###Setup you environment!!! or script will not work!
###------------
##
## Change below to your directory structure!
export LOC=$PWD
#export LOC=/root/employees
###-----------
### End Environment 
###-----------


###Don't change anything else!!!

#Check if compress packages exsits!
echo ""
echo ""
echo "Checking if employees compress file is present - employees.tar.gz"
echo ""
echo ""

empfile=`ls $PWD/employees.tar.gz |wc -l`
if [ ${empfile} = 1 ]; then
echo ""
echo ""
echo "uncompress file - employees.tar.gz"
echo ""
echo ""
tar -zxvf $PWD/employees.tar.gz

export M_CREATE_DB_TABLES="mysql < $LOC/employees_partitioned.sql"
echo $M_CREATE_DB_TABLES

export chk_create_db_sql=`ls employees_partitioned.sql|wc -l`
echo $chk_create_db_sql

if [ $chk_create_db_sql < 1 ] ; then
echo "Create script is missing!"
	exit 0;
else 
echo "Starting Database and Tables creation - EMPLOYEES"

#"$M_CREATE_DB_TABLES"
mysql -e  "source $LOC/employees_partitioned.sql"
mysql -e  "source $LOC/test_employees_md5.sql"
mysql -e  "source $LOC/test_employees_sha.sql"

mysql -e "grant all on employees.* TO 'ec2'@'%' IDENTIFIED BY 'cloudera'"

fi

else
echo ""
echo ""
echo "File employees.tar.gz is missing"
echo "-- exiting --"
exit 0
echo ""
echo ""
fi
