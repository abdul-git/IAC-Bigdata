#!/bin/bash


mysql <<EOF

CREATE USER 'ec2'@'localhost' IDENTIFIED BY 'cloudera';
CREATE USER 'ec2'@'%' IDENTIFIED BY 'cloudera';

GRANT ALL PRIVILEGES ON * . * TO 'ec2'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'ec2'@'%';

FLUSH PRIVILEGES;

EOF

