package Java.Day_54_Inheritance_Composition_Example;

public class TestA {
    public static void main(String[] args) {

        Akbank ismetBankaHesabi=new Akbank(1000,AccountType.SAVING);
        System.out.println("ismetBankaHesabi.getCurrentBalance() = " + ismetBankaHesabi.getCurrentBalance());
        System.out.println("ismetBankaHesabi.getDepositeBonus() = " + ismetBankaHesabi.getDepositeBonus());

        KaraBank ismetBankHes2=new KaraBank(1120,AccountType.GOLD);
       // System.out.println("ismetBankHes2.getAccountType() = " + ismetBankHes2.getAccountType());
        System.out.println("ismetBankHes2.getCurrentBalance() = " + ismetBankHes2.getCurrentBalance());
        System.out.println("ismetBankHes2.getDepositeBonus() = " + ismetBankHes2.getDepositeBonus());

        ismetBankaHesabi.deposite(2000);
        ismetBankHes2.deposite(1200);

        ismetBankaHesabi.withdraw(3150);
        ismetBankHes2.withdraw(2000);

        ismetBankaHesabi.deposite(300);
        ismetBankaHesabi.deposite(5300);
        ismetBankaHesabi.withdraw(5300);
        ismetBankHes2.withdraw(400);
        ismetBankHes2.deposite(500);
        // Akbank icin.
        System.out.println("ismetin Akbank saving yatirim hesabinin mevcut hali :"+ismetBankaHesabi.getCurrentBalance());
        //Karabank icin
        System.out.println("ismetin Karabank altin yatirim hesabinin mevcut hali :"+ismetBankHes2.getCurrentBalance());

        ismetBankaHesabi.mevcutHesapKapatma();
        ismetBankHes2.mevcutHesapKapatma();
        // Akbank icin.
        System.out.println("ismetin Akbank saving yatirim hesabinin mevcut hali :"+ismetBankaHesabi.getCurrentBalance());
        System.out.println("ismetin Akbank mevduat hesabinin mevcut hali :"+ismetBankaHesabi.getCariHesapBalance());
        //Karabank icin
        System.out.println("ismetin Karabank gold yatirim hesabinin mevcut hali :"+ismetBankHes2.getCurrentBalance());
        System.out.println("ismetin Karabank mevduat hesabinin mevcut hali :"+ismetBankHes2.getCariHesapBalance());

    }
}
