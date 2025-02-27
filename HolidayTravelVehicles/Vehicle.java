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

  public String getVehicleInfo(){
    return "Serial Number: "+this.serialNum+"\tName: "+this.name+"\tModel: "+this.model+"\tYear: "+this.year+"\tManufacturer: "+this.manufacturer+"\tBase cost: "+this.baseCost;
  }
}
