#!/bin/bash
read -p "Enter root Password for MySQL: " -s PASSWD

sudo echo "[client]" > ~root/.my.cnf
sudo echo "user=root" >> ~root/.my.cnf
sudo echo "password=${PASSWD}" >> ~root/.my.cnf


echo "test mysql login"
echo "listing databases"
echo "================="
echo ""

mysql <<EOF
show databases;
EOF

echo ""
echo "================="
