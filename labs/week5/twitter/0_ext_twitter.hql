CREATE EXTERNAL TABLE `tweets_raw`(
)
ROW FORMAT SERDE 
  'com.cloudera.hive.serde.JSONSerDe' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  '/flume/tweets/'

