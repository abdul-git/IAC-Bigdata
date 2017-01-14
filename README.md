#Introduction


This document is only for reference purpose to help students with weekly labs and is a guide to work hands-on with Big-Data stack.  This document is living document and will be update during and after the course.

We will use this repo to setup labs and individual cluster in order to complete hands on exercises.

##Week-1: Intro to Hadoop 

##Week-2: Cloudera hadoop cluster deployment in AWS

##Week-3a: Cloudera hadoop cluster deployment in AWS

Continue from previous week.

1 -	Add a new data node to existing cluster

2 -	Configure Hadoop NN HA –

3 -	Perform manual and automatic switchover

4 - 	Configure RM - HA

##Week-3b: MYSQL Setup

After successful Hadoop cluster deployment in AWS, we will need to setup MySQL databases from scripts that can be found at GitHub repo for data movement exercises.


repo URL = https://github.com/abdul-git/IAC-Bigdata

Also, repo can be cloned using code below:

```
git clone https://github.com/abdul-git/IAC-Bigdata.git
```





We will work with three different type of datasets: Airlines, Retail_DB and Employees

•	Create database xxxx
•	Load data into interim mysql database
•	Verify tables and dataset

First we need to download and stage installation scripts from GitHub repo

git clone https://github.com/abdul-git/IAC-Bigdata


Above command will clone needed scripts to stage the datasets.
 cd  /xyz/IAC-Bigdata/labs/week3/setup_mysql

cd airlines

cat 1_create_pw.ksh

Change root password to match your password

echo "[client]" > ~/.my.cnf
echo "user=root" >> ~/.my.cnf
echo "password=xxxxxxx" >> ~/.my.cnf


echo "test mysql login"
echo "listing databases"
echo "================="
echo ""

mysql <<EOF

show databases;

EOF

echo ""
echo "================="


#Execute scripts

./1_create_pw.ksh

Script above will create env file, so mysql login will not prompt for password.

./2_drop_create_airlines_tables.ksh

Script above will download airlines data for year 2008, create database called “airlines” and populate three tables.



#Week-4
A.	 SQOOP SETUP AND IMPORT DATA FROM MYSQL
B.	CREATE HIVE TABLES FROM EXISTING DATASET
C.	CREATE TWITTER STREAM USING FLUME 

#Week-5

Visual




