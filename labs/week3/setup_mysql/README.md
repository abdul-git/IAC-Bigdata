Week 3 – Setup MySQL 
 
Before we can import sample data into MySQL, we need to configure MySQL for password less execution.
 
1 -     First Execute “create_mycf.sh” script, it will create “.my.cnf” file in root home directory.

				----------------------------------------------------
				[root@ip-172-31-12-92 setup_mysql]# ./create_mycf.sh  
				Enter root Password for MySQL: test mysql login 
				listing databases 
				================= 
				  
				Database 
				information_schema 
				mysql 
				  
				================= 
				----------------------------------------------------
				
 

2 -     After successfully creating “.my.cnf” file, execute script “create_ec2_user.sh” and this will create user called “ec2-user” in MySQL database.

3 -     Once, step above are successful, you can create databases below from respective directories:
		a -     airlines
		b -     employess
		c -     retail_db
