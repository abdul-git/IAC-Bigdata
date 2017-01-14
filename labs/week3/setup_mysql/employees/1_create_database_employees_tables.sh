#!/bin/bash


## Get data first
###------------
###Setup your environment!!! or script will not work!
###------------
##
## Change below to your directory structure!
export LOC=~/IAC-Bigdata/labs/week3/setup_mysql/employees
#export LOC=/root/employees
###-----------
### End Environment 
###-----------


###Don't change anything else!!!

export M_CREATE_DB_TABLES="mysql < $LOC/employees_partitioned.sql"
echo $M_CREATE_DB_TABLES
set -x 

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

grant all on employees.* TO 'ec2'@'%' IDENTIFIED BY 'cloudera';

fi


