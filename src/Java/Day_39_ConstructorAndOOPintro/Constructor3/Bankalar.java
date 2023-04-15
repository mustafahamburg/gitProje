package Java.Day_39_ConstructorAndOOPintro.Constructor3;

public class Bankalar {
    public static void main(String[] args) {
        Banka banka1=new Banka("BankAsya",0,2003,200,"Vatandas");
        System.out.println(banka1.toString());

        Banka banka2=new Banka("isBank",548,1996,158,"Ahmet");
        System.out.println(banka2.toString());
    }
}
