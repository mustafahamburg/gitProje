package Java.Day_54_Inheritance_Composition_Example;
/////////////////Variable///////////////////////////////////////
public abstract class Bank {
  private double currentBalance; // ilk hesap acildi,kapanana kadarhesap dengesini tutar
 // private String accountType; // hesap turu
  boolean isAccountClosed=true; // hesap kapali mi?
  private double depositeBonus; // para yatirma kosullarina bagli olarak verilen bonus para miktari
  private double withdravExpence; // para cekme kosullarina bagli olarak islem ucreti(hesap turune bagli)
  private double returnRate; // Hesap kapatildiginda alinacak kar orani(currect balance ile carpilarqak esaplanir)
    private double cariHesapBalance;


  //////////////Constructor////////////////////////////////////////
  public Bank(double currentBalance, AccountType accountType) {
        // this.currentBalance = currentBalance;  //boyle yazarsak herkes ulasabilir ,guvenli degil
        // this.accountType = accountType;
    this.setCurrentBalance(currentBalance);// encapsulation ile constructor olusturduk,guvenli oldu
    //this.setAccountType(accountType);
    System.out.println(getClass().getSimpleName() + " 'a HOSGELDINIZ! \n HesapTuru: " + accountType);
        // (getClass().getSimpleName()--> Obje create edilen Constructor in
        // oldugu class ismini cagirir
        // Bu java Obje class ina ait framework(kutuphane bilgisini cagirdik)
    this.isAccountClosed = false; // Hesap acildi
  }
////////////////Genel Methodlar/////////////////////////////////////////////
    /**
     * Bu method para yatirma islemleri icin kull.
     * @param depositeValue-->,yatirilacak para miktarini gosterir
     */
    public  void deposite(double depositeValue){
        //this.currentBalance+=depositeValue;
      if(depositeValue<0){
        System.out.println("INVALID DEPOSITE VALUE !! PLEASE CHECK YOUR INPUT ");
      }else {
        setCurrentBalance(getCurrentBalance()+depositeValue); //get ile mevcut balance cagirdim ve
                                                              // yatirilmasi istenen miktari ekledim
        System.out.println("HESABINIZA "+depositeValue+" para eklenmistir.\n Mevcut Miktariniz :"+getCurrentBalance());
      }

    }

  /**
   * Bu method para cekme islemi yapar.current balanstan para cekip cekileni cikartip gunceller
   * @param withdrawValue--> Cekilen para miktari
   */
    public  void withdraw(double withdrawValue){
    if(withdrawValue<0){
      System.out.println("INVALID DEPOSITE VALUE !! PLEASE CHECK YOUR INPUT ");
    }else if(getCurrentBalance()<withdrawValue+getWithdravExpence()) {
      System.out.println("YETERSIZ BAKIYE");
    }else {
      setCurrentBalance(getCurrentBalance()-withdrawValue);

      System.out.println("HESABINIZAN "+ withdrawValue+" para cekilmistir.\n Mevcut Miktariniz :"+getCurrentBalance());
    }
    }
    public void mevcutHesapKapatma(){
      setCariHesapBalance(getCurrentBalance()*getReturnRate()); //Bir mevduat hesabi ve buna ait  yatirim hesaplari var.
                                                    //bu yatirim hesaplari kapatildiginda ,yatirim hesabindaki miktar
                                                    //ve getirisi ile birlikte mevduat hesaba aktarilir,bunu yaptik.
        setCurrentBalance(0); // esabi kapatip kar orani ile carpip kar +mevcut miktari mevduata aktardik,hes.sifirlandi
        isAccountClosed=true;
        System.out.println("Hesabiniz kapatilmistir.Mevcut hesap bilgileriniz: "+getCariHesapBalance());

    }

    //////////////// ABSTRACT METHODLAR ///////////////////////////////////////

    public abstract void tuzukKur();
    public abstract void teminatSistemi();

    public abstract void HesapAcmaBonusu(AccountType accountType);



    ////////////////////Get Set Methodlar//////////////////////////////////////////////

  public double getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(double currentBalance) {

    if(currentBalance<0){
      System.out.println("Balance hesabi negatve degeralamaz! Hesabiniz sifirlandi");
    }else {
      this.currentBalance=currentBalance; // Hesabi actiginda yatirdigi para hesabina eklendi
    }
  }

    public double getCariHesapBalance() {
        return cariHesapBalance;
    }

    public void setCariHesapBalance(double cariHesapBalance) {
        this.cariHesapBalance = cariHesapBalance;
    }
  /*public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType.toUpperCase(); // Hesabin turu belirlendi
  }

   */



  public double getDepositeBonus() {
    return depositeBonus;
  }

  public void setDepositeBonus(double depositeBonus) {
    this.depositeBonus = depositeBonus;
  }

  public double getWithdravExpence() {
    return withdravExpence;
  }

  public void setWithdravExpence(double withdravExpence) {
    this.withdravExpence = withdravExpence;
  }

  public double getReturnRate() {
    return returnRate;
  }

  public void setReturnRate(double returnRate) {
    this.returnRate = returnRate;
  }
}
