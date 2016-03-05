// ORM class for table 'ontime'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 04 13:09:38 EST 2016
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ontime extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer Year;
  public Integer get_Year() {
    return Year;
  }
  public void set_Year(Integer Year) {
    this.Year = Year;
  }
  public ontime with_Year(Integer Year) {
    this.Year = Year;
    return this;
  }
  private Integer Month;
  public Integer get_Month() {
    return Month;
  }
  public void set_Month(Integer Month) {
    this.Month = Month;
  }
  public ontime with_Month(Integer Month) {
    this.Month = Month;
    return this;
  }
  private Integer DayofMonth;
  public Integer get_DayofMonth() {
    return DayofMonth;
  }
  public void set_DayofMonth(Integer DayofMonth) {
    this.DayofMonth = DayofMonth;
  }
  public ontime with_DayofMonth(Integer DayofMonth) {
    this.DayofMonth = DayofMonth;
    return this;
  }
  private Integer DayOfWeek;
  public Integer get_DayOfWeek() {
    return DayOfWeek;
  }
  public void set_DayOfWeek(Integer DayOfWeek) {
    this.DayOfWeek = DayOfWeek;
  }
  public ontime with_DayOfWeek(Integer DayOfWeek) {
    this.DayOfWeek = DayOfWeek;
    return this;
  }
  private Integer DepTime;
  public Integer get_DepTime() {
    return DepTime;
  }
  public void set_DepTime(Integer DepTime) {
    this.DepTime = DepTime;
  }
  public ontime with_DepTime(Integer DepTime) {
    this.DepTime = DepTime;
    return this;
  }
  private Integer CRSDepTime;
  public Integer get_CRSDepTime() {
    return CRSDepTime;
  }
  public void set_CRSDepTime(Integer CRSDepTime) {
    this.CRSDepTime = CRSDepTime;
  }
  public ontime with_CRSDepTime(Integer CRSDepTime) {
    this.CRSDepTime = CRSDepTime;
    return this;
  }
  private Integer ArrTime;
  public Integer get_ArrTime() {
    return ArrTime;
  }
  public void set_ArrTime(Integer ArrTime) {
    this.ArrTime = ArrTime;
  }
  public ontime with_ArrTime(Integer ArrTime) {
    this.ArrTime = ArrTime;
    return this;
  }
  private Integer CRSArrTime;
  public Integer get_CRSArrTime() {
    return CRSArrTime;
  }
  public void set_CRSArrTime(Integer CRSArrTime) {
    this.CRSArrTime = CRSArrTime;
  }
  public ontime with_CRSArrTime(Integer CRSArrTime) {
    this.CRSArrTime = CRSArrTime;
    return this;
  }
  private String UniqueCarrier;
  public String get_UniqueCarrier() {
    return UniqueCarrier;
  }
  public void set_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
  }
  public ontime with_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
    return this;
  }
  private Integer FlightNum;
  public Integer get_FlightNum() {
    return FlightNum;
  }
  public void set_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
  }
  public ontime with_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
    return this;
  }
  private String TailNum;
  public String get_TailNum() {
    return TailNum;
  }
  public void set_TailNum(String TailNum) {
    this.TailNum = TailNum;
  }
  public ontime with_TailNum(String TailNum) {
    this.TailNum = TailNum;
    return this;
  }
  private Integer ActualElapsedTime;
  public Integer get_ActualElapsedTime() {
    return ActualElapsedTime;
  }
  public void set_ActualElapsedTime(Integer ActualElapsedTime) {
    this.ActualElapsedTime = ActualElapsedTime;
  }
  public ontime with_ActualElapsedTime(Integer ActualElapsedTime) {
    this.ActualElapsedTime = ActualElapsedTime;
    return this;
  }
  private Integer CRSElapsedTime;
  public Integer get_CRSElapsedTime() {
    return CRSElapsedTime;
  }
  public void set_CRSElapsedTime(Integer CRSElapsedTime) {
    this.CRSElapsedTime = CRSElapsedTime;
  }
  public ontime with_CRSElapsedTime(Integer CRSElapsedTime) {
    this.CRSElapsedTime = CRSElapsedTime;
    return this;
  }
  private Integer AirTime;
  public Integer get_AirTime() {
    return AirTime;
  }
  public void set_AirTime(Integer AirTime) {
    this.AirTime = AirTime;
  }
  public ontime with_AirTime(Integer AirTime) {
    this.AirTime = AirTime;
    return this;
  }
  private Integer ArrDelay;
  public Integer get_ArrDelay() {
    return ArrDelay;
  }
  public void set_ArrDelay(Integer ArrDelay) {
    this.ArrDelay = ArrDelay;
  }
  public ontime with_ArrDelay(Integer ArrDelay) {
    this.ArrDelay = ArrDelay;
    return this;
  }
  private Integer DepDelay;
  public Integer get_DepDelay() {
    return DepDelay;
  }
  public void set_DepDelay(Integer DepDelay) {
    this.DepDelay = DepDelay;
  }
  public ontime with_DepDelay(Integer DepDelay) {
    this.DepDelay = DepDelay;
    return this;
  }
  private String Origin;
  public String get_Origin() {
    return Origin;
  }
  public void set_Origin(String Origin) {
    this.Origin = Origin;
  }
  public ontime with_Origin(String Origin) {
    this.Origin = Origin;
    return this;
  }
  private String Dest;
  public String get_Dest() {
    return Dest;
  }
  public void set_Dest(String Dest) {
    this.Dest = Dest;
  }
  public ontime with_Dest(String Dest) {
    this.Dest = Dest;
    return this;
  }
  private Integer Distance;
  public Integer get_Distance() {
    return Distance;
  }
  public void set_Distance(Integer Distance) {
    this.Distance = Distance;
  }
  public ontime with_Distance(Integer Distance) {
    this.Distance = Distance;
    return this;
  }
  private Integer TaxiIn;
  public Integer get_TaxiIn() {
    return TaxiIn;
  }
  public void set_TaxiIn(Integer TaxiIn) {
    this.TaxiIn = TaxiIn;
  }
  public ontime with_TaxiIn(Integer TaxiIn) {
    this.TaxiIn = TaxiIn;
    return this;
  }
  private Integer TaxiOut;
  public Integer get_TaxiOut() {
    return TaxiOut;
  }
  public void set_TaxiOut(Integer TaxiOut) {
    this.TaxiOut = TaxiOut;
  }
  public ontime with_TaxiOut(Integer TaxiOut) {
    this.TaxiOut = TaxiOut;
    return this;
  }
  private Integer Cancelled;
  public Integer get_Cancelled() {
    return Cancelled;
  }
  public void set_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
  }
  public ontime with_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
    return this;
  }
  private String CancellationCode;
  public String get_CancellationCode() {
    return CancellationCode;
  }
  public void set_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
  }
  public ontime with_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
    return this;
  }
  private String Diverted;
  public String get_Diverted() {
    return Diverted;
  }
  public void set_Diverted(String Diverted) {
    this.Diverted = Diverted;
  }
  public ontime with_Diverted(String Diverted) {
    this.Diverted = Diverted;
    return this;
  }
  private Integer CarrierDelay;
  public Integer get_CarrierDelay() {
    return CarrierDelay;
  }
  public void set_CarrierDelay(Integer CarrierDelay) {
    this.CarrierDelay = CarrierDelay;
  }
  public ontime with_CarrierDelay(Integer CarrierDelay) {
    this.CarrierDelay = CarrierDelay;
    return this;
  }
  private Integer WeatherDelay;
  public Integer get_WeatherDelay() {
    return WeatherDelay;
  }
  public void set_WeatherDelay(Integer WeatherDelay) {
    this.WeatherDelay = WeatherDelay;
  }
  public ontime with_WeatherDelay(Integer WeatherDelay) {
    this.WeatherDelay = WeatherDelay;
    return this;
  }
  private Integer NASDelay;
  public Integer get_NASDelay() {
    return NASDelay;
  }
  public void set_NASDelay(Integer NASDelay) {
    this.NASDelay = NASDelay;
  }
  public ontime with_NASDelay(Integer NASDelay) {
    this.NASDelay = NASDelay;
    return this;
  }
  private Integer SecurityDelay;
  public Integer get_SecurityDelay() {
    return SecurityDelay;
  }
  public void set_SecurityDelay(Integer SecurityDelay) {
    this.SecurityDelay = SecurityDelay;
  }
  public ontime with_SecurityDelay(Integer SecurityDelay) {
    this.SecurityDelay = SecurityDelay;
    return this;
  }
  private Integer LateAircraftDelay;
  public Integer get_LateAircraftDelay() {
    return LateAircraftDelay;
  }
  public void set_LateAircraftDelay(Integer LateAircraftDelay) {
    this.LateAircraftDelay = LateAircraftDelay;
  }
  public ontime with_LateAircraftDelay(Integer LateAircraftDelay) {
    this.LateAircraftDelay = LateAircraftDelay;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ontime)) {
      return false;
    }
    ontime that = (ontime) o;
    boolean equal = true;
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Month == null ? that.Month == null : this.Month.equals(that.Month));
    equal = equal && (this.DayofMonth == null ? that.DayofMonth == null : this.DayofMonth.equals(that.DayofMonth));
    equal = equal && (this.DayOfWeek == null ? that.DayOfWeek == null : this.DayOfWeek.equals(that.DayOfWeek));
    equal = equal && (this.DepTime == null ? that.DepTime == null : this.DepTime.equals(that.DepTime));
    equal = equal && (this.CRSDepTime == null ? that.CRSDepTime == null : this.CRSDepTime.equals(that.CRSDepTime));
    equal = equal && (this.ArrTime == null ? that.ArrTime == null : this.ArrTime.equals(that.ArrTime));
    equal = equal && (this.CRSArrTime == null ? that.CRSArrTime == null : this.CRSArrTime.equals(that.CRSArrTime));
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.ActualElapsedTime == null ? that.ActualElapsedTime == null : this.ActualElapsedTime.equals(that.ActualElapsedTime));
    equal = equal && (this.CRSElapsedTime == null ? that.CRSElapsedTime == null : this.CRSElapsedTime.equals(that.CRSElapsedTime));
    equal = equal && (this.AirTime == null ? that.AirTime == null : this.AirTime.equals(that.AirTime));
    equal = equal && (this.ArrDelay == null ? that.ArrDelay == null : this.ArrDelay.equals(that.ArrDelay));
    equal = equal && (this.DepDelay == null ? that.DepDelay == null : this.DepDelay.equals(that.DepDelay));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    equal = equal && (this.CarrierDelay == null ? that.CarrierDelay == null : this.CarrierDelay.equals(that.CarrierDelay));
    equal = equal && (this.WeatherDelay == null ? that.WeatherDelay == null : this.WeatherDelay.equals(that.WeatherDelay));
    equal = equal && (this.NASDelay == null ? that.NASDelay == null : this.NASDelay.equals(that.NASDelay));
    equal = equal && (this.SecurityDelay == null ? that.SecurityDelay == null : this.SecurityDelay.equals(that.SecurityDelay));
    equal = equal && (this.LateAircraftDelay == null ? that.LateAircraftDelay == null : this.LateAircraftDelay.equals(that.LateAircraftDelay));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ontime)) {
      return false;
    }
    ontime that = (ontime) o;
    boolean equal = true;
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Month == null ? that.Month == null : this.Month.equals(that.Month));
    equal = equal && (this.DayofMonth == null ? that.DayofMonth == null : this.DayofMonth.equals(that.DayofMonth));
    equal = equal && (this.DayOfWeek == null ? that.DayOfWeek == null : this.DayOfWeek.equals(that.DayOfWeek));
    equal = equal && (this.DepTime == null ? that.DepTime == null : this.DepTime.equals(that.DepTime));
    equal = equal && (this.CRSDepTime == null ? that.CRSDepTime == null : this.CRSDepTime.equals(that.CRSDepTime));
    equal = equal && (this.ArrTime == null ? that.ArrTime == null : this.ArrTime.equals(that.ArrTime));
    equal = equal && (this.CRSArrTime == null ? that.CRSArrTime == null : this.CRSArrTime.equals(that.CRSArrTime));
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.ActualElapsedTime == null ? that.ActualElapsedTime == null : this.ActualElapsedTime.equals(that.ActualElapsedTime));
    equal = equal && (this.CRSElapsedTime == null ? that.CRSElapsedTime == null : this.CRSElapsedTime.equals(that.CRSElapsedTime));
    equal = equal && (this.AirTime == null ? that.AirTime == null : this.AirTime.equals(that.AirTime));
    equal = equal && (this.ArrDelay == null ? that.ArrDelay == null : this.ArrDelay.equals(that.ArrDelay));
    equal = equal && (this.DepDelay == null ? that.DepDelay == null : this.DepDelay.equals(that.DepDelay));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    equal = equal && (this.CarrierDelay == null ? that.CarrierDelay == null : this.CarrierDelay.equals(that.CarrierDelay));
    equal = equal && (this.WeatherDelay == null ? that.WeatherDelay == null : this.WeatherDelay.equals(that.WeatherDelay));
    equal = equal && (this.NASDelay == null ? that.NASDelay == null : this.NASDelay.equals(that.NASDelay));
    equal = equal && (this.SecurityDelay == null ? that.SecurityDelay == null : this.SecurityDelay.equals(that.SecurityDelay));
    equal = equal && (this.LateAircraftDelay == null ? that.LateAircraftDelay == null : this.LateAircraftDelay.equals(that.LateAircraftDelay));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Month = JdbcWritableBridge.readInteger(2, __dbResults);
    this.DayofMonth = JdbcWritableBridge.readInteger(3, __dbResults);
    this.DayOfWeek = JdbcWritableBridge.readInteger(4, __dbResults);
    this.DepTime = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CRSDepTime = JdbcWritableBridge.readInteger(6, __dbResults);
    this.ArrTime = JdbcWritableBridge.readInteger(7, __dbResults);
    this.CRSArrTime = JdbcWritableBridge.readInteger(8, __dbResults);
    this.UniqueCarrier = JdbcWritableBridge.readString(9, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(10, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(11, __dbResults);
    this.ActualElapsedTime = JdbcWritableBridge.readInteger(12, __dbResults);
    this.CRSElapsedTime = JdbcWritableBridge.readInteger(13, __dbResults);
    this.AirTime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.ArrDelay = JdbcWritableBridge.readInteger(15, __dbResults);
    this.DepDelay = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Origin = JdbcWritableBridge.readString(17, __dbResults);
    this.Dest = JdbcWritableBridge.readString(18, __dbResults);
    this.Distance = JdbcWritableBridge.readInteger(19, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readInteger(21, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(22, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(23, __dbResults);
    this.Diverted = JdbcWritableBridge.readString(24, __dbResults);
    this.CarrierDelay = JdbcWritableBridge.readInteger(25, __dbResults);
    this.WeatherDelay = JdbcWritableBridge.readInteger(26, __dbResults);
    this.NASDelay = JdbcWritableBridge.readInteger(27, __dbResults);
    this.SecurityDelay = JdbcWritableBridge.readInteger(28, __dbResults);
    this.LateAircraftDelay = JdbcWritableBridge.readInteger(29, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Month = JdbcWritableBridge.readInteger(2, __dbResults);
    this.DayofMonth = JdbcWritableBridge.readInteger(3, __dbResults);
    this.DayOfWeek = JdbcWritableBridge.readInteger(4, __dbResults);
    this.DepTime = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CRSDepTime = JdbcWritableBridge.readInteger(6, __dbResults);
    this.ArrTime = JdbcWritableBridge.readInteger(7, __dbResults);
    this.CRSArrTime = JdbcWritableBridge.readInteger(8, __dbResults);
    this.UniqueCarrier = JdbcWritableBridge.readString(9, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(10, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(11, __dbResults);
    this.ActualElapsedTime = JdbcWritableBridge.readInteger(12, __dbResults);
    this.CRSElapsedTime = JdbcWritableBridge.readInteger(13, __dbResults);
    this.AirTime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.ArrDelay = JdbcWritableBridge.readInteger(15, __dbResults);
    this.DepDelay = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Origin = JdbcWritableBridge.readString(17, __dbResults);
    this.Dest = JdbcWritableBridge.readString(18, __dbResults);
    this.Distance = JdbcWritableBridge.readInteger(19, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readInteger(21, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(22, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(23, __dbResults);
    this.Diverted = JdbcWritableBridge.readString(24, __dbResults);
    this.CarrierDelay = JdbcWritableBridge.readInteger(25, __dbResults);
    this.WeatherDelay = JdbcWritableBridge.readInteger(26, __dbResults);
    this.NASDelay = JdbcWritableBridge.readInteger(27, __dbResults);
    this.SecurityDelay = JdbcWritableBridge.readInteger(28, __dbResults);
    this.LateAircraftDelay = JdbcWritableBridge.readInteger(29, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(Year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Month, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayofMonth, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayOfWeek, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepTime, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSDepTime, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrTime, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSArrTime, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(UniqueCarrier, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ActualElapsedTime, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSElapsedTime, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(AirTime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrDelay, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepDelay, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Distance, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiIn, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiOut, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Diverted, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CarrierDelay, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WeatherDelay, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(NASDelay, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SecurityDelay, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(LateAircraftDelay, 29 + __off, 4, __dbStmt);
    return 29;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(Year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Month, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayofMonth, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayOfWeek, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepTime, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSDepTime, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrTime, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSArrTime, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(UniqueCarrier, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ActualElapsedTime, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSElapsedTime, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(AirTime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrDelay, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepDelay, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Distance, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiIn, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiOut, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Diverted, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CarrierDelay, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WeatherDelay, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(NASDelay, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SecurityDelay, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(LateAircraftDelay, 29 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Year = null;
    } else {
    this.Year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Month = null;
    } else {
    this.Month = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DayofMonth = null;
    } else {
    this.DayofMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DayOfWeek = null;
    } else {
    this.DayOfWeek = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepTime = null;
    } else {
    this.DepTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CRSDepTime = null;
    } else {
    this.CRSDepTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrTime = null;
    } else {
    this.ArrTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CRSArrTime = null;
    } else {
    this.CRSArrTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UniqueCarrier = null;
    } else {
    this.UniqueCarrier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FlightNum = null;
    } else {
    this.FlightNum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TailNum = null;
    } else {
    this.TailNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ActualElapsedTime = null;
    } else {
    this.ActualElapsedTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CRSElapsedTime = null;
    } else {
    this.CRSElapsedTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AirTime = null;
    } else {
    this.AirTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrDelay = null;
    } else {
    this.ArrDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepDelay = null;
    } else {
    this.DepDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Origin = null;
    } else {
    this.Origin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Dest = null;
    } else {
    this.Dest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Distance = null;
    } else {
    this.Distance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiIn = null;
    } else {
    this.TaxiIn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiOut = null;
    } else {
    this.TaxiOut = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Cancelled = null;
    } else {
    this.Cancelled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CancellationCode = null;
    } else {
    this.CancellationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Diverted = null;
    } else {
    this.Diverted = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CarrierDelay = null;
    } else {
    this.CarrierDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WeatherDelay = null;
    } else {
    this.WeatherDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.NASDelay = null;
    } else {
    this.NASDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SecurityDelay = null;
    } else {
    this.SecurityDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LateAircraftDelay = null;
    } else {
    this.LateAircraftDelay = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Month);
    }
    if (null == this.DayofMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayofMonth);
    }
    if (null == this.DayOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayOfWeek);
    }
    if (null == this.DepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepTime);
    }
    if (null == this.CRSDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSDepTime);
    }
    if (null == this.ArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrTime);
    }
    if (null == this.CRSArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSArrTime);
    }
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.ActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ActualElapsedTime);
    }
    if (null == this.CRSElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSElapsedTime);
    }
    if (null == this.AirTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AirTime);
    }
    if (null == this.ArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrDelay);
    }
    if (null == this.DepDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepDelay);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Distance);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiOut);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Diverted);
    }
    if (null == this.CarrierDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CarrierDelay);
    }
    if (null == this.WeatherDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WeatherDelay);
    }
    if (null == this.NASDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NASDelay);
    }
    if (null == this.SecurityDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SecurityDelay);
    }
    if (null == this.LateAircraftDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.LateAircraftDelay);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Month);
    }
    if (null == this.DayofMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayofMonth);
    }
    if (null == this.DayOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayOfWeek);
    }
    if (null == this.DepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepTime);
    }
    if (null == this.CRSDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSDepTime);
    }
    if (null == this.ArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrTime);
    }
    if (null == this.CRSArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSArrTime);
    }
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.ActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ActualElapsedTime);
    }
    if (null == this.CRSElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSElapsedTime);
    }
    if (null == this.AirTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AirTime);
    }
    if (null == this.ArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrDelay);
    }
    if (null == this.DepDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepDelay);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Distance);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiOut);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Diverted);
    }
    if (null == this.CarrierDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CarrierDelay);
    }
    if (null == this.WeatherDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WeatherDelay);
    }
    if (null == this.NASDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NASDelay);
    }
    if (null == this.SecurityDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SecurityDelay);
    }
    if (null == this.LateAircraftDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.LateAircraftDelay);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Month==null?"null":"" + Month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayofMonth==null?"null":"" + DayofMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayOfWeek==null?"null":"" + DayOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTime==null?"null":"" + DepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSDepTime==null?"null":"" + CRSDepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTime==null?"null":"" + ArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSArrTime==null?"null":"" + CRSArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ActualElapsedTime==null?"null":"" + ActualElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSElapsedTime==null?"null":"" + CRSElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirTime==null?"null":"" + AirTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelay==null?"null":"" + ArrDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelay==null?"null":"" + DepDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":Diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierDelay==null?"null":"" + CarrierDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeatherDelay==null?"null":"" + WeatherDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NASDelay==null?"null":"" + NASDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SecurityDelay==null?"null":"" + SecurityDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LateAircraftDelay==null?"null":"" + LateAircraftDelay, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Month==null?"null":"" + Month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayofMonth==null?"null":"" + DayofMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayOfWeek==null?"null":"" + DayOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTime==null?"null":"" + DepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSDepTime==null?"null":"" + CRSDepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTime==null?"null":"" + ArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSArrTime==null?"null":"" + CRSArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ActualElapsedTime==null?"null":"" + ActualElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSElapsedTime==null?"null":"" + CRSElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirTime==null?"null":"" + AirTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelay==null?"null":"" + ArrDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelay==null?"null":"" + DepDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":Diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierDelay==null?"null":"" + CarrierDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeatherDelay==null?"null":"" + WeatherDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NASDelay==null?"null":"" + NASDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SecurityDelay==null?"null":"" + SecurityDelay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LateAircraftDelay==null?"null":"" + LateAircraftDelay, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Month = null; } else {
      this.Month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayofMonth = null; } else {
      this.DayofMonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayOfWeek = null; } else {
      this.DayOfWeek = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepTime = null; } else {
      this.DepTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSDepTime = null; } else {
      this.CRSDepTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrTime = null; } else {
      this.ArrTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSArrTime = null; } else {
      this.CRSArrTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ActualElapsedTime = null; } else {
      this.ActualElapsedTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSElapsedTime = null; } else {
      this.CRSElapsedTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirTime = null; } else {
      this.AirTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelay = null; } else {
      this.ArrDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelay = null; } else {
      this.DepDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Diverted = null; } else {
      this.Diverted = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CarrierDelay = null; } else {
      this.CarrierDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeatherDelay = null; } else {
      this.WeatherDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NASDelay = null; } else {
      this.NASDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SecurityDelay = null; } else {
      this.SecurityDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LateAircraftDelay = null; } else {
      this.LateAircraftDelay = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Month = null; } else {
      this.Month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayofMonth = null; } else {
      this.DayofMonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayOfWeek = null; } else {
      this.DayOfWeek = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepTime = null; } else {
      this.DepTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSDepTime = null; } else {
      this.CRSDepTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrTime = null; } else {
      this.ArrTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSArrTime = null; } else {
      this.CRSArrTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ActualElapsedTime = null; } else {
      this.ActualElapsedTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSElapsedTime = null; } else {
      this.CRSElapsedTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirTime = null; } else {
      this.AirTime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelay = null; } else {
      this.ArrDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelay = null; } else {
      this.DepDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Diverted = null; } else {
      this.Diverted = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CarrierDelay = null; } else {
      this.CarrierDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeatherDelay = null; } else {
      this.WeatherDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NASDelay = null; } else {
      this.NASDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SecurityDelay = null; } else {
      this.SecurityDelay = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LateAircraftDelay = null; } else {
      this.LateAircraftDelay = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ontime o = (ontime) super.clone();
    return o;
  }

  public void clone0(ontime o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Month", this.Month);
    __sqoop$field_map.put("DayofMonth", this.DayofMonth);
    __sqoop$field_map.put("DayOfWeek", this.DayOfWeek);
    __sqoop$field_map.put("DepTime", this.DepTime);
    __sqoop$field_map.put("CRSDepTime", this.CRSDepTime);
    __sqoop$field_map.put("ArrTime", this.ArrTime);
    __sqoop$field_map.put("CRSArrTime", this.CRSArrTime);
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("ActualElapsedTime", this.ActualElapsedTime);
    __sqoop$field_map.put("CRSElapsedTime", this.CRSElapsedTime);
    __sqoop$field_map.put("AirTime", this.AirTime);
    __sqoop$field_map.put("ArrDelay", this.ArrDelay);
    __sqoop$field_map.put("DepDelay", this.DepDelay);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("Distance", this.Distance);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Diverted", this.Diverted);
    __sqoop$field_map.put("CarrierDelay", this.CarrierDelay);
    __sqoop$field_map.put("WeatherDelay", this.WeatherDelay);
    __sqoop$field_map.put("NASDelay", this.NASDelay);
    __sqoop$field_map.put("SecurityDelay", this.SecurityDelay);
    __sqoop$field_map.put("LateAircraftDelay", this.LateAircraftDelay);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Month", this.Month);
    __sqoop$field_map.put("DayofMonth", this.DayofMonth);
    __sqoop$field_map.put("DayOfWeek", this.DayOfWeek);
    __sqoop$field_map.put("DepTime", this.DepTime);
    __sqoop$field_map.put("CRSDepTime", this.CRSDepTime);
    __sqoop$field_map.put("ArrTime", this.ArrTime);
    __sqoop$field_map.put("CRSArrTime", this.CRSArrTime);
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("ActualElapsedTime", this.ActualElapsedTime);
    __sqoop$field_map.put("CRSElapsedTime", this.CRSElapsedTime);
    __sqoop$field_map.put("AirTime", this.AirTime);
    __sqoop$field_map.put("ArrDelay", this.ArrDelay);
    __sqoop$field_map.put("DepDelay", this.DepDelay);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("Distance", this.Distance);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Diverted", this.Diverted);
    __sqoop$field_map.put("CarrierDelay", this.CarrierDelay);
    __sqoop$field_map.put("WeatherDelay", this.WeatherDelay);
    __sqoop$field_map.put("NASDelay", this.NASDelay);
    __sqoop$field_map.put("SecurityDelay", this.SecurityDelay);
    __sqoop$field_map.put("LateAircraftDelay", this.LateAircraftDelay);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("Year".equals(__fieldName)) {
      this.Year = (Integer) __fieldVal;
    }
    else    if ("Month".equals(__fieldName)) {
      this.Month = (Integer) __fieldVal;
    }
    else    if ("DayofMonth".equals(__fieldName)) {
      this.DayofMonth = (Integer) __fieldVal;
    }
    else    if ("DayOfWeek".equals(__fieldName)) {
      this.DayOfWeek = (Integer) __fieldVal;
    }
    else    if ("DepTime".equals(__fieldName)) {
      this.DepTime = (Integer) __fieldVal;
    }
    else    if ("CRSDepTime".equals(__fieldName)) {
      this.CRSDepTime = (Integer) __fieldVal;
    }
    else    if ("ArrTime".equals(__fieldName)) {
      this.ArrTime = (Integer) __fieldVal;
    }
    else    if ("CRSArrTime".equals(__fieldName)) {
      this.CRSArrTime = (Integer) __fieldVal;
    }
    else    if ("UniqueCarrier".equals(__fieldName)) {
      this.UniqueCarrier = (String) __fieldVal;
    }
    else    if ("FlightNum".equals(__fieldName)) {
      this.FlightNum = (Integer) __fieldVal;
    }
    else    if ("TailNum".equals(__fieldName)) {
      this.TailNum = (String) __fieldVal;
    }
    else    if ("ActualElapsedTime".equals(__fieldName)) {
      this.ActualElapsedTime = (Integer) __fieldVal;
    }
    else    if ("CRSElapsedTime".equals(__fieldName)) {
      this.CRSElapsedTime = (Integer) __fieldVal;
    }
    else    if ("AirTime".equals(__fieldName)) {
      this.AirTime = (Integer) __fieldVal;
    }
    else    if ("ArrDelay".equals(__fieldName)) {
      this.ArrDelay = (Integer) __fieldVal;
    }
    else    if ("DepDelay".equals(__fieldName)) {
      this.DepDelay = (Integer) __fieldVal;
    }
    else    if ("Origin".equals(__fieldName)) {
      this.Origin = (String) __fieldVal;
    }
    else    if ("Dest".equals(__fieldName)) {
      this.Dest = (String) __fieldVal;
    }
    else    if ("Distance".equals(__fieldName)) {
      this.Distance = (Integer) __fieldVal;
    }
    else    if ("TaxiIn".equals(__fieldName)) {
      this.TaxiIn = (Integer) __fieldVal;
    }
    else    if ("TaxiOut".equals(__fieldName)) {
      this.TaxiOut = (Integer) __fieldVal;
    }
    else    if ("Cancelled".equals(__fieldName)) {
      this.Cancelled = (Integer) __fieldVal;
    }
    else    if ("CancellationCode".equals(__fieldName)) {
      this.CancellationCode = (String) __fieldVal;
    }
    else    if ("Diverted".equals(__fieldName)) {
      this.Diverted = (String) __fieldVal;
    }
    else    if ("CarrierDelay".equals(__fieldName)) {
      this.CarrierDelay = (Integer) __fieldVal;
    }
    else    if ("WeatherDelay".equals(__fieldName)) {
      this.WeatherDelay = (Integer) __fieldVal;
    }
    else    if ("NASDelay".equals(__fieldName)) {
      this.NASDelay = (Integer) __fieldVal;
    }
    else    if ("SecurityDelay".equals(__fieldName)) {
      this.SecurityDelay = (Integer) __fieldVal;
    }
    else    if ("LateAircraftDelay".equals(__fieldName)) {
      this.LateAircraftDelay = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("Year".equals(__fieldName)) {
      this.Year = (Integer) __fieldVal;
      return true;
    }
    else    if ("Month".equals(__fieldName)) {
      this.Month = (Integer) __fieldVal;
      return true;
    }
    else    if ("DayofMonth".equals(__fieldName)) {
      this.DayofMonth = (Integer) __fieldVal;
      return true;
    }
    else    if ("DayOfWeek".equals(__fieldName)) {
      this.DayOfWeek = (Integer) __fieldVal;
      return true;
    }
    else    if ("DepTime".equals(__fieldName)) {
      this.DepTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("CRSDepTime".equals(__fieldName)) {
      this.CRSDepTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("ArrTime".equals(__fieldName)) {
      this.ArrTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("CRSArrTime".equals(__fieldName)) {
      this.CRSArrTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("UniqueCarrier".equals(__fieldName)) {
      this.UniqueCarrier = (String) __fieldVal;
      return true;
    }
    else    if ("FlightNum".equals(__fieldName)) {
      this.FlightNum = (Integer) __fieldVal;
      return true;
    }
    else    if ("TailNum".equals(__fieldName)) {
      this.TailNum = (String) __fieldVal;
      return true;
    }
    else    if ("ActualElapsedTime".equals(__fieldName)) {
      this.ActualElapsedTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("CRSElapsedTime".equals(__fieldName)) {
      this.CRSElapsedTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("AirTime".equals(__fieldName)) {
      this.AirTime = (Integer) __fieldVal;
      return true;
    }
    else    if ("ArrDelay".equals(__fieldName)) {
      this.ArrDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("DepDelay".equals(__fieldName)) {
      this.DepDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("Origin".equals(__fieldName)) {
      this.Origin = (String) __fieldVal;
      return true;
    }
    else    if ("Dest".equals(__fieldName)) {
      this.Dest = (String) __fieldVal;
      return true;
    }
    else    if ("Distance".equals(__fieldName)) {
      this.Distance = (Integer) __fieldVal;
      return true;
    }
    else    if ("TaxiIn".equals(__fieldName)) {
      this.TaxiIn = (Integer) __fieldVal;
      return true;
    }
    else    if ("TaxiOut".equals(__fieldName)) {
      this.TaxiOut = (Integer) __fieldVal;
      return true;
    }
    else    if ("Cancelled".equals(__fieldName)) {
      this.Cancelled = (Integer) __fieldVal;
      return true;
    }
    else    if ("CancellationCode".equals(__fieldName)) {
      this.CancellationCode = (String) __fieldVal;
      return true;
    }
    else    if ("Diverted".equals(__fieldName)) {
      this.Diverted = (String) __fieldVal;
      return true;
    }
    else    if ("CarrierDelay".equals(__fieldName)) {
      this.CarrierDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("WeatherDelay".equals(__fieldName)) {
      this.WeatherDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("NASDelay".equals(__fieldName)) {
      this.NASDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("SecurityDelay".equals(__fieldName)) {
      this.SecurityDelay = (Integer) __fieldVal;
      return true;
    }
    else    if ("LateAircraftDelay".equals(__fieldName)) {
      this.LateAircraftDelay = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
