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
}
