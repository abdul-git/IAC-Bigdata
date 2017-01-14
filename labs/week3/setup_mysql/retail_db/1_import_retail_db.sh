#!/bin/bash


## Get data first
###------------
###Setup you environment!!! or script will not work!
###------------
##
## Change below to your directory structure!
export LOC=~/IAC-Bigdata/labs/week3/setup_mysql/retail_db
###-----------
### End Environment
###-----------


###Don't change anything else!!!


cd $LOC
echo "" 
echo "Checking for Retail_DB compress file"
echo ""
compfile=retail_db.dmp.gz
chk_compress=`ls retail_db.dmp.gz|wc -l`
echo ""
echo " Compress file found --- $chk_compress"
echo ""
echo "Starting uncompress --"
echo ""
if [ $chk_compress = 1 ] ; then
gzip -d $compfile

check_dumpfile=`ls retail_db.dmp |wc -l`
echo ""
echo ""
echo "Retail_db dumpfile file found!!! count = $check_dumpfile"

echo ""
echo ""
if [ $check_dumpfile != 1 ]; then
echo ""
echo ""
echo "retail db Dump file not found...Exiting"
exit 0;
echo ""
echo ""
else

cd $LOC
echo ""
echo "=========================="
echo "creating database Retail_DB"
echo ""
echo ""
mysql <<EOF

create database retail_db;

EOF

echo "verify tables count"

mysql retail_db < $LOC/retail_db.dmp

echo " "
echo "Count for categories"
mysql -e "select count(*) from  retail_db.categories"
echo " "
echo "Count for categories"
mysql -e "select count(*) from  retail_db.customers"
echo " "
echo "Count for departments"
mysql -e "select count(*) from  retail_db.departments"
echo " "
echo "Count for order_items"
mysql -e "select count(*) from  retail_db.order_items"
echo " "
echo "Count for orders"
mysql -e "select count(*) from  retail_db.orders"
echo " "
echo "Count for products"
mysql -e "select count(*) from  retail_db.products"


gzip $LOC/retail_db.dmp
fi
else 
exit 0;
fi
