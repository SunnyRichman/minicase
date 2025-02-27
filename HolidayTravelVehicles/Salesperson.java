public class Salesperson{

  private int ID;
  private String phoneNum;
  private String address;
  
  public Salesperson(int id, String _phoneNum, String addr){
    this.ID = id;
    this.phoneNum = _phoneNum;
    this.address = addr;
  }
  
  public void setID(int _ID) {
      this.ID = _ID;
  }
  
  public void setPhoneNum(String _phoneNum) {
      this.phoneNum = _phoneNum;
  }
  
  public void setAddress(String _address) {
      this.address = _address;
  }
  
  public int getID() {
      return ID;
  }
  
  public String getPhoneNum() {
      return phoneNum;
  }
  
  public String getAddress() {
      return address;
  }
  
  public String log() {
      return getID() + "\t" + getPhoneNum() + "\t" + getAddress();
  }
  
}
