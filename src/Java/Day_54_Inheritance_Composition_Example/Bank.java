package Java.Day_54_Inheritance_Composition_Example;

public class Bank {
  private double currentBalance; // ilk hesap acildi,kapanana kadarhesap dengesini tutar
  private String accountType; // hesap turu
  boolean isAccountClosed=true; // hesap kapali mi?

  public Bank(double currentBalance, String accountType) {
   // this.currentBalance = currentBalance;  //boyle yazarsak herkes ulasabilir ,guvenli degil
   // this.accountType = accountType;
    this.setCurrentBalance(currentBalance);// encapsulation ile constructor olusturduk,guvenli oldu
    this.setAccountType(accountType);
    System.out.println(getClass().getSimpleName()+" 'a HOSGELDINIZ! \n HesapTuru: "+this.getAccountType());
    // (getClass().getSimpleName()--> Obje create edilen Constructor in
    // oldugu class ismini cagirir
    // Bu java Obje class ina ait framework(kutuphane bilgisini cagirdik)
    this.isAccountClosed=false; // Hesap acildi
  }
  public double getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(double currentBalance) {
    if(currentBalance<0){
      System.out.println("Balance hesabi negatve degeralamaz! Hesabiniz sifirlandi");
    }else {
      this.currentBalance = currentBalance; // Hesabi actiginda yatirdigi para hesabina eklendi
    }
  }
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType.toUpperCase(); // Hesabin turu belirlendi
  }
  // Githup deneme





}
