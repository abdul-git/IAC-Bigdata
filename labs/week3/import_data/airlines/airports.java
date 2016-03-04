// ORM class for table 'airports'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Mar 03 09:41:07 EST 2016
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

public class airports extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String IATA;
  public String get_IATA() {
    return IATA;
  }
  public void set_IATA(String IATA) {
    this.IATA = IATA;
  }
  public airports with_IATA(String IATA) {
    this.IATA = IATA;
    return this;
  }
  private String airports_name;
  public String get_airports_name() {
    return airports_name;
  }
  public void set_airports_name(String airports_name) {
    this.airports_name = airports_name;
  }
  public airports with_airports_name(String airports_name) {
    this.airports_name = airports_name;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public airports with_state(String state) {
    this.state = state;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public airports with_country(String country) {
    this.country = country;
    return this;
  }
  private Float lat;
  public Float get_lat() {
    return lat;
  }
  public void set_lat(Float lat) {
    this.lat = lat;
  }
  public airports with_lat(Float lat) {
    this.lat = lat;
    return this;
  }
  private Float lng;
  public Float get_lng() {
    return lng;
  }
  public void set_lng(Float lng) {
    this.lng = lng;
  }
  public airports with_lng(Float lng) {
    this.lng = lng;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof airports)) {
      return false;
    }
    airports that = (airports) o;
    boolean equal = true;
    equal = equal && (this.IATA == null ? that.IATA == null : this.IATA.equals(that.IATA));
    equal = equal && (this.airports_name == null ? that.airports_name == null : this.airports_name.equals(that.airports_name));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this.lng == null ? that.lng == null : this.lng.equals(that.lng));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof airports)) {
      return false;
    }
    airports that = (airports) o;
    boolean equal = true;
    equal = equal && (this.IATA == null ? that.IATA == null : this.IATA.equals(that.IATA));
    equal = equal && (this.airports_name == null ? that.airports_name == null : this.airports_name.equals(that.airports_name));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this.lng == null ? that.lng == null : this.lng.equals(that.lng));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.IATA = JdbcWritableBridge.readString(1, __dbResults);
    this.airports_name = JdbcWritableBridge.readString(2, __dbResults);
    this.state = JdbcWritableBridge.readString(3, __dbResults);
    this.country = JdbcWritableBridge.readString(4, __dbResults);
    this.lat = JdbcWritableBridge.readFloat(5, __dbResults);
    this.lng = JdbcWritableBridge.readFloat(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.IATA = JdbcWritableBridge.readString(1, __dbResults);
    this.airports_name = JdbcWritableBridge.readString(2, __dbResults);
    this.state = JdbcWritableBridge.readString(3, __dbResults);
    this.country = JdbcWritableBridge.readString(4, __dbResults);
    this.lat = JdbcWritableBridge.readFloat(5, __dbResults);
    this.lng = JdbcWritableBridge.readFloat(6, __dbResults);
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
    JdbcWritableBridge.writeString(IATA, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airports_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(lat, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(lng, 6 + __off, 7, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(IATA, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airports_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(lat, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(lng, 6 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.IATA = null;
    } else {
    this.IATA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.airports_name = null;
    } else {
    this.airports_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lat = null;
    } else {
    this.lat = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.lng = null;
    } else {
    this.lng = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.IATA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IATA);
    }
    if (null == this.airports_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airports_name);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.lat);
    }
    if (null == this.lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.lng);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.IATA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IATA);
    }
    if (null == this.airports_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airports_name);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.lat);
    }
    if (null == this.lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.lng);
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
    __sb.append(FieldFormatter.escapeAndEnclose(IATA==null?"null":IATA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airports_name==null?"null":airports_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":"" + lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lng==null?"null":"" + lng, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(IATA==null?"null":IATA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airports_name==null?"null":airports_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":"" + lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lng==null?"null":"" + lng, delimiters));
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
    if (__cur_str.equals("null")) { this.IATA = null; } else {
      this.IATA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.airports_name = null; } else {
      this.airports_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lat = null; } else {
      this.lat = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lng = null; } else {
      this.lng = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IATA = null; } else {
      this.IATA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.airports_name = null; } else {
      this.airports_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lat = null; } else {
      this.lat = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lng = null; } else {
      this.lng = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    airports o = (airports) super.clone();
    return o;
  }

  public void clone0(airports o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("IATA", this.IATA);
    __sqoop$field_map.put("airports_name", this.airports_name);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("lng", this.lng);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("IATA", this.IATA);
    __sqoop$field_map.put("airports_name", this.airports_name);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("lng", this.lng);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("IATA".equals(__fieldName)) {
      this.IATA = (String) __fieldVal;
    }
    else    if ("airports_name".equals(__fieldName)) {
      this.airports_name = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
    }
    else    if ("lat".equals(__fieldName)) {
      this.lat = (Float) __fieldVal;
    }
    else    if ("lng".equals(__fieldName)) {
      this.lng = (Float) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("IATA".equals(__fieldName)) {
      this.IATA = (String) __fieldVal;
      return true;
    }
    else    if ("airports_name".equals(__fieldName)) {
      this.airports_name = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
      return true;
    }
    else    if ("lat".equals(__fieldName)) {
      this.lat = (Float) __fieldVal;
      return true;
    }
    else    if ("lng".equals(__fieldName)) {
      this.lng = (Float) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
