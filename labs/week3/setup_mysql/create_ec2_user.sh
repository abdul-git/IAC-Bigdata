#!/bin/bash


mysql <<EOF

CREATE USER 'ec2'@'localhost' IDENTIFIED BY 'cloudera';
CREATE USER 'ec2'@'%' IDENTIFIED BY 'cloudera';
grant all on retail_db.* TO 'ec2'@'%' IDENTIFIED BY 'cloudera';
grant all on airlines.* TO 'ec2'@'%' IDENTIFIED BY 'cloudera';
grant all on employees.* TO 'ec2'@'%' IDENTIFIED BY 'cloudera';

GRANT ALL PRIVILEGES ON * . * TO 'ec2'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'ec2'@'%';

FLUSH PRIVILEGES;

EOF

