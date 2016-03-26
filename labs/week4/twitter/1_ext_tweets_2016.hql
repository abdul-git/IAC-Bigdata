add jar hive-serdes-1.0-SNAPSHOT.jar;
CREATE EXTERNAL TABLE `tweets_2016`(
  `id` bigint COMMENT 'from deserializer', 
  `created_at` string COMMENT 'from deserializer', 
  `source` string COMMENT 'from deserializer', 
  `favorited` boolean COMMENT 'from deserializer', 
  `retweeted_status` struct<text:string,user:struct<screen_name:string,name:string>,retweet_count:int> COMMENT 'from deserializer', 
  `entities` struct<urls:array<struct<expanded_url:string>>,user_mentions:array<struct<screen_name:string,name:string>>,hashtags:array<struct<text:string>>> COMMENT 'from deserializer', 
  `text` string COMMENT 'from deserializer', 
  `user` struct<screen_name:string,name:string,friends_count:int,followers_count:int,statuses_count:int,verified:boolean,utc_offset:int,time_zone:string> COMMENT 'from deserializer', 
  `in_reply_to_screen_name` string COMMENT 'from deserializer')
PARTITIONED BY ( 
  `datehour` int)
ROW FORMAT SERDE 
  'com.cloudera.hive.serde.JSONSerDe' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  '/flume/tweets/2016/'
