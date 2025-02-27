public class TradeIn{
  private int serialNum;
  private String make;
  private int year;

  public TradeIn(int _serialNum, String _make, int _year) {
    this.serialNum = _serialNum;
    this.make = _make;
    this.year = _year;
  }

  public void setSerialNum(int _serialNum) {
      this.serialNum = _serialNum;
  }
  
  public void setMake(String _make) {
      this.make = _make;
  }
  
  public void setYear(int _year) {
      this.year = _year;
  }
  
  public int getSerialNum() {
      return serialNum;
  }
  
  public String getMake() {
      return make;
  }
  
  public int getYear() {
      return year;
  }
  
  public String log() {
      return getSerialNum() + "\t" + getMake() + "\t" + getYear();
  }

}
