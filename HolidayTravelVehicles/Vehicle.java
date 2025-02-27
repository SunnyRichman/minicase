public class Vehicle{

  private int serialNum;
  private String name;
  private String model;
  private int year;
  private String manufacturer;
  private int baseCost;
    
  public Vehicle(int _serial, String _name, String _model, int _year, String _manu, int _base){
    this.serialNum = _serial;
    this.name = _name;
    this.model = _model;
    this.year = _year;
    this.manufacturer = _manu;
    this.baseCost = _base;
  }

  public void setSerialNum(int _serialNum) {
      this.serialNum = _serialNum;
  }
  
  public void setName(String _name) {
      this.name = _name;
  }
  
  public void setModel(String _model) {
      this.model = _model;
  }
  
  public void setYear(int _year) {
      this.year = _year;
  }
  
  public void setManufacturer(String _manufacturer) {
      this.manufacturer = _manufacturer;
  }
  
  public void setBaseCost(int _baseCost) {
      this.baseCost = _baseCost;
  }
  
  public int getSerialNum() {
      return serialNum;
  }
  
  public String getName() {
      return name;
  }
  
  public String getModel() {
      return model;
  }
  
  public int getYear() {
      return year;
  }
  
  public String getManufacturer() {
      return manufacturer;
  }
  
  public int getBaseCost() {
      return baseCost;
  }
  
  public String log() {
      return getSerialNum() + "\t" + getName() + "\t" + getModel() + "\t" + getYear() + "\t" + getManufacturer() + "\t" + getBaseCost();
  }

}
