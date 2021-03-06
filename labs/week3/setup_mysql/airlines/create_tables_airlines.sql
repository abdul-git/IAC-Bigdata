use airlines;

create table ontime (
  Year int,
  Month int,
  DayofMonth int,
  DayOfWeek int,
  DepTime  int,
  CRSDepTime int,
  ArrTime int,
  CRSArrTime int,
  UniqueCarrier varchar(5),
  FlightNum int,
  TailNum varchar(8),
  ActualElapsedTime int,
  CRSElapsedTime int,
  AirTime int,
  ArrDelay int,
  DepDelay int,
  Origin varchar(3),
  Dest varchar(3),
  Distance int,
  TaxiIn int,
  TaxiOut int,
  Cancelled int,
  CancellationCode varchar(1),
  Diverted varchar(1),
  CarrierDelay int,
  WeatherDelay int,
  NASDelay int,
  SecurityDelay int,
  LateAircraftDelay int
);

create  table  carriers(
code varchar(5),
carrier_name varchar(30)
);

create table airports (
airport_id varchar(5),
airport varchar(20),
city varchar(20),
country varchar(20),
IATA_FAA varchar(5),
ICAO	varchar(4),
lat FLOAT ( 11, 7 ),  
lng FLOAT ( 11, 7 ),
Altitude int,
Timezone varchar(5),
DST_timezone varchar(65)
);
