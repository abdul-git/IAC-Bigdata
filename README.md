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

```shell
git clone https://github.com/abdul-git/IAC-Bigdata.git
```





We will work with three different type of datasets: Airlines, Retail_DB and Employees

```shell
•	Create database xxxx
•	Load data into interim mysql database
•	Verify tables and dataset
```

First we need to download and stage installation scripts from GitHub repo

```shell
git clone https://github.com/abdul-git/IAC-Bigdata.git
```


Above command will clone needed scripts to stage the datasets.
```shell
 cd  /xyz/IAC-Bigdata/labs/week3/setup_mysql
```

Where "/xyz" is location where you cloned and stored git repo.

##Execute scripts

Before we can import data, we need to setup MySQL for password less execution. In order to do that, switch to directory by using code below:

```shell
cd ~/IAC-Bigdata/labs/week3/
```

Once you are in Week3 directory, execute the setup scripts as below:

```shell
./create_mycf.sh
./create_ec2_user.sh
```

Scripts above will create env file and creates user ec2-user(for AWS deployment), so mysql login will not prompt for password.

#####Week 3 -Data Lab Setup

For Week 3 Data labs, sequence below should be followed to complete the data labs

1 - setup_mysql - Create and load data into MySQL databases

2 - import_data - imports data from MySQL using sqoop 

3 - mr_word_count - Sample map reduce program - pre-built or you can compile java code

##### Database creation

Instructions for DB creation can be followed by using README for each database.


#Week-4
A.	 SQOOP SETUP AND IMPORT DATA FROM MYSQL
B.	CREATE HIVE TABLES FROM EXISTING DATASET
C.	CREATE TWITTER STREAM USING FLUME 

#Week-5

Visual




