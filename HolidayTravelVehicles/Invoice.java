public class Invoice{
  private Customer fullCustomerInfo;
  private String tradeInVecInfo;
  private String purchaseVecInfo;
  private String dealerOptions;
  private int negotiatedPrice;
  private int taxesLicenseFee;

  public Invoice(Customer _fullCustomer, String _tradeInVec, String _purchaseVec, String _dealer, int Price, int _taxesLicenseFee) {
    this.fullCustomerInfo = _fullCustomer;
    this.tradeInVecInfo = _tradeInVec;
    this.purchaseVecInfo = _purchaseVec;
    this.dealerOptions = _dealer;
    this.negotiatedPrice = Price;
    this.taxesLicenseFee = _taxesLicenseFee;
  }

  public void setFullCustomerInfo(Customer _fullCustomerInfo) {
      this.fullCustomerInfo = _fullCustomerInfo;
  }
  
  public void setTradeInVecInfo(String _tradeInVecInfo) {
      this.tradeInVecInfo = _tradeInVecInfo;
  }
  
  public void setPurchaseVecInfo(String _purchaseVecInfo) {
      this.purchaseVecInfo = _purchaseVecInfo;
  }
  
  public void setDealerOptions(String _dealerOptions) {
      this.dealerOptions = _dealerOptions;
  }
  
  public void setNegotiatedPrice(int _negotiatedPrice) {
      this.negotiatedPrice = _negotiatedPrice;
  }
  
  public void setTaxesLicenseFee(int _taxesLicenseFee) {
      this.taxesLicenseFee = _taxesLicenseFee;
  }
  
  public Customer getFullCustomerInfo() {
      return fullCustomerInfo;
  }
  
  public String getTradeInVecInfo() {
      return tradeInVecInfo;
  }
  
  public String getPurchaseVecInfo() {
      return purchaseVecInfo;
  }
  
  public String getDealerOptions() {
      return dealerOptions;
  }
  
  public int getNegotiatedPrice() {
      return negotiatedPrice;
  }
  
  public int getTaxesLicenseFee() {
      return taxesLicenseFee;
  }
  
  public String log() {
      return getFullCustomerInfo() + "\t" + getTradeInVecInfo() + "\t" + getPurchaseVecInfo() + "\t" + getDealerOptions() + "\t" + getNegotiatedPrice() + "\t" + getTaxesLicenseFee();
  }

}
