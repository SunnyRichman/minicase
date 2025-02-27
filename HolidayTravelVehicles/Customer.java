public class Customer{

  private int ID;
  private String name;
  private String address;
  private String phoneNum;
  
  public Customer(int id, String _name, String addr, String _phoneNum){
    this.ID = id;
    this.name = _name;
    this.address = addr;
    this.phoneNum = _phoneNum;
  }

  public void setID(int _ID) {
    this.ID = _ID;
  }

  public void setName(String _name) {
      this.name = _name;
  }
  
  public void setAddress(String _address) {
      this.address = _address;
  }
  
  public void setPhoneNum(String _phoneNum) {
      this.phoneNum = _phoneNum;
  }

  public int getID() {
    return ID;
}

  public String getName() {
      return name;
  }
  
  public String getAddress() {
      return address;
  }
  
  public String getPhoneNum() {
      return phoneNum;
  }

  public String log() {
    return getID() + "\t" + getName() + "\t" + getAddress() + "\t" + getPhoneNum();
  }

}
