public class Dealer{
  private int optionCode;
  private String description;
  private int price;

  public Dealer(int Code, String desc, int _price) {
    this.optionCode = Code;
    this.description = desc;
    this.price = _price;
  }

  public void setOptionCode(int _optionCode) {
      this.optionCode = _optionCode;
  }
  
  public void setDescription(String _description) {
      this.description = _description;
  }
  
  public void setPrice(int _price) {
      this.price = _price;
  }

  public int getOptionCode() {
      return optionCode;
  }
  
  public String getDescription() {
      return description;
  }
  
  public int getPrice() {
      return price;
  }
  
  public String log() {
      return getOptionCode() + "\t" + getDescription() + "\t" + getPrice();
  }

}
