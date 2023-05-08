package Java.Day_54_Inheritance_Composition_Example;

public class KaraBank extends Bank{

    public KaraBank(double currentBalance, String accountType) {
        super(currentBalance+100, accountType);
    }
    public void Bonus(String accountType){
        switch (accountType){
            case "GOLD":
                setDepositeBonus(80);
                setWithdravExpence(90);
                setReturnRate(1.4);
                break;
            case "SAVING":
                setDepositeBonus(100);
                setWithdravExpence(70);
                setReturnRate(1.1);
                break;
            case "INTEREST":
                setDepositeBonus(90);
                setWithdravExpence(80);
                setReturnRate(1.2);
                break;
            default:
                System.out.println("Gecersiz Hesap Turu");
                break;
        }
    }
    @Override
    public void deposite(double depositeValue) {
        if(depositeValue<3000) { //3000 den az olan durumda bir degisiklik olmadigi icin ,
            // yatirilan degeri super e gonderdik
            super.deposite(depositeValue);
        }else {   // deposite volue -->=3000 demektir
            super.deposite(depositeValue+getDepositeBonus());
        }
    }
    @Override
    public void withdraw(double withdrawValue) {
        if(withdrawValue<2000) {
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue+getWithdravExpence()); // Burada kesinti ucreti ile cekilen miktar
                                                             // balance den cikarildigi icin(islem ucreti ile birlikte)
        }
    }
}
