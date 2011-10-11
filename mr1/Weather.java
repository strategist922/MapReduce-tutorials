// File generated by hadoop record compiler. Do not edit.
package no.gnome.mapreduce;

public class Weather extends org.apache.hadoop.record.Record {
  private static final org.apache.hadoop.record.meta.RecordTypeInfo _rio_recTypeInfo;
  private static org.apache.hadoop.record.meta.RecordTypeInfo _rio_rtiFilter;
  private static int[] _rio_rtiFilterFields;
  static {
    _rio_recTypeInfo = new org.apache.hadoop.record.meta.RecordTypeInfo("Weather");
    _rio_recTypeInfo.addField("year", org.apache.hadoop.record.meta.TypeID.StringTypeID);
    _rio_recTypeInfo.addField("month", org.apache.hadoop.record.meta.TypeID.IntTypeID);
    _rio_recTypeInfo.addField("day", org.apache.hadoop.record.meta.TypeID.IntTypeID);
    _rio_recTypeInfo.addField("temperature", org.apache.hadoop.record.meta.TypeID.IntTypeID);
    _rio_recTypeInfo.addField("quality", org.apache.hadoop.record.meta.TypeID.StringTypeID);
  }
  
  private String year;
  private int month;
  private int day;
  private int temperature;
  private String quality;
  public Weather() { }
  public Weather(
    final String year,
    final int month,
    final int day,
    final int temperature,
    final String quality) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.temperature = temperature;
    this.quality = quality;
  }
  public static org.apache.hadoop.record.meta.RecordTypeInfo getTypeInfo() {
    return _rio_recTypeInfo;
  }
  public static void setTypeFilter(org.apache.hadoop.record.meta.RecordTypeInfo rti) {
    if (null == rti) return;
    _rio_rtiFilter = rti;
    _rio_rtiFilterFields = null;
  }
  private static void setupRtiFields()
  {
    if (null == _rio_rtiFilter) return;
    // we may already have done this
    if (null != _rio_rtiFilterFields) return;
    int _rio_i, _rio_j;
    _rio_rtiFilterFields = new int [_rio_rtiFilter.getFieldTypeInfos().size()];
    for (_rio_i=0; _rio_i<_rio_rtiFilterFields.length; _rio_i++) {
      _rio_rtiFilterFields[_rio_i] = 0;
    }
    java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_itFilter = _rio_rtiFilter.getFieldTypeInfos().iterator();
    _rio_i=0;
    while (_rio_itFilter.hasNext()) {
      org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfoFilter = _rio_itFilter.next();
      java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_it = _rio_recTypeInfo.getFieldTypeInfos().iterator();
      _rio_j=1;
      while (_rio_it.hasNext()) {
        org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfo = _rio_it.next();
        if (_rio_tInfo.equals(_rio_tInfoFilter)) {
          _rio_rtiFilterFields[_rio_i] = _rio_j;
          break;
        }
        _rio_j++;
      }
      _rio_i++;
    }
  }
  public String getYear() {
    return year;
  }
  public void setYear(final String year) {
    this.year=year;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(final int month) {
    this.month=month;
  }
  public int getDay() {
    return day;
  }
  public void setDay(final int day) {
    this.day=day;
  }
  public int getTemperature() {
    return temperature;
  }
  public void setTemperature(final int temperature) {
    this.temperature=temperature;
  }
  public String getQuality() {
    return quality;
  }
  public void setQuality(final String quality) {
    this.quality=quality;
  }
  public void serialize(final org.apache.hadoop.record.RecordOutput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(this,_rio_tag);
    _rio_a.writeString(year,"year");
    _rio_a.writeInt(month,"month");
    _rio_a.writeInt(day,"day");
    _rio_a.writeInt(temperature,"temperature");
    _rio_a.writeString(quality,"quality");
    _rio_a.endRecord(this,_rio_tag);
  }
  private void deserializeWithoutFilter(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(_rio_tag);
    year=_rio_a.readString("year");
    month=_rio_a.readInt("month");
    day=_rio_a.readInt("day");
    temperature=_rio_a.readInt("temperature");
    quality=_rio_a.readString("quality");
    _rio_a.endRecord(_rio_tag);
  }
  public void deserialize(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    if (null == _rio_rtiFilter) {
      deserializeWithoutFilter(_rio_a, _rio_tag);
      return;
    }
    // if we're here, we need to read based on version info
    _rio_a.startRecord(_rio_tag);
    setupRtiFields();
    for (int _rio_i=0; _rio_i<_rio_rtiFilter.getFieldTypeInfos().size(); _rio_i++) {
      if (1 == _rio_rtiFilterFields[_rio_i]) {
        year=_rio_a.readString("year");
      }
      else if (2 == _rio_rtiFilterFields[_rio_i]) {
        month=_rio_a.readInt("month");
      }
      else if (3 == _rio_rtiFilterFields[_rio_i]) {
        day=_rio_a.readInt("day");
      }
      else if (4 == _rio_rtiFilterFields[_rio_i]) {
        temperature=_rio_a.readInt("temperature");
      }
      else if (5 == _rio_rtiFilterFields[_rio_i]) {
        quality=_rio_a.readString("quality");
      }
      else {
        java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo> typeInfos = (java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo>)(_rio_rtiFilter.getFieldTypeInfos());
        org.apache.hadoop.record.meta.Utils.skip(_rio_a, typeInfos.get(_rio_i).getFieldID(), typeInfos.get(_rio_i).getTypeID());
      }
    }
    _rio_a.endRecord(_rio_tag);
  }
  public int compareTo (final Object _rio_peer_) throws ClassCastException {
    if (!(_rio_peer_ instanceof Weather)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    Weather _rio_peer = (Weather) _rio_peer_;
    int _rio_ret = 0;
    _rio_ret = year.compareTo(_rio_peer.year);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (month == _rio_peer.month)? 0 :((month<_rio_peer.month)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (day == _rio_peer.day)? 0 :((day<_rio_peer.day)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (temperature == _rio_peer.temperature)? 0 :((temperature<_rio_peer.temperature)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = quality.compareTo(_rio_peer.quality);
    if (_rio_ret != 0) return _rio_ret;
    return _rio_ret;
  }
  public boolean equals(final Object _rio_peer_) {
    if (!(_rio_peer_ instanceof Weather)) {
      return false;
    }
    if (_rio_peer_ == this) {
      return true;
    }
    Weather _rio_peer = (Weather) _rio_peer_;
    boolean _rio_ret = false;
    _rio_ret = year.equals(_rio_peer.year);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (month==_rio_peer.month);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (day==_rio_peer.day);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (temperature==_rio_peer.temperature);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = quality.equals(_rio_peer.quality);
    if (!_rio_ret) return _rio_ret;
    return _rio_ret;
  }
  public Object clone() throws CloneNotSupportedException {
    Weather _rio_other = new Weather();
    _rio_other.year = this.year;
    _rio_other.month = this.month;
    _rio_other.day = this.day;
    _rio_other.temperature = this.temperature;
    _rio_other.quality = this.quality;
    return _rio_other;
  }
  public int hashCode() {
    int _rio_result = 17;
    int _rio_ret;
    _rio_ret = year.hashCode();
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (int)month;
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (int)day;
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (int)temperature;
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = quality.hashCode();
    _rio_result = 37*_rio_result + _rio_ret;
    return _rio_result;
  }
  public static String signature() {
    return "LWeather(siiis)";
  }
  public static class Comparator extends org.apache.hadoop.record.RecordComparator {
    public Comparator() {
      super(Weather.class);
    }
    static public int slurpRaw(byte[] b, int s, int l) {
      try {
        int os = s;
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=(z+i); l-= (z+i);
        }
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=(z+i); l-= (z+i);
        }
        return (os - s);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    static public int compareRaw(byte[] b1, int s1, int l1,
                                   byte[] b2, int s2, int l2) {
      try {
        int os1 = s1;
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
          int r1 = org.apache.hadoop.record.Utils.compareBytes(b1,s1,i1,b2,s2,i2);
          if (r1 != 0) { return (r1<0)?-1:0; }
          s1+=i1; s2+=i2; l1-=i1; l1-=i2;
        }
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
          int r1 = org.apache.hadoop.record.Utils.compareBytes(b1,s1,i1,b2,s2,i2);
          if (r1 != 0) { return (r1<0)?-1:0; }
          s1+=i1; s2+=i2; l1-=i1; l1-=i2;
        }
        return (os1 - s1);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    public int compare(byte[] b1, int s1, int l1,
                         byte[] b2, int s2, int l2) {
      int ret = compareRaw(b1,s1,l1,b2,s2,l2);
      return (ret == -1)? -1 : ((ret==0)? 1 : 0);}
  }
  
  static {
    org.apache.hadoop.record.RecordComparator.define(Weather.class, new Comparator());
  }
}
