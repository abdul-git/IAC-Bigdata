echo "[client]" > ~/.my.cnf
echo "user=root" >> ~/.my.cnf
echo "password=cloudera" >> ~/.my.cnf


echo "test mysql login"
echo "listing databases"
echo "================="
echo ""

mysql <<EOF

show databases;

EOF

echo ""
echo "================="
