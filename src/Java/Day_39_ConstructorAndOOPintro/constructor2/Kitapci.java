package Java.Day_39_ConstructorAndOOPintro.constructor2;

public class Kitapci {
    public static void main(String[] args) {

        Kitap k1=new Kitap("Fazil",1921,"Cile");
        System.out.println(k1.toString()); // Cile 1921 Fazil
        k1.name="Sefiller";
        System.out.println(k1.toString()); // Sefiller 1921 Fazil

        Kitap k2=new Kitap("Efendileri",2023,"Javanin");
        System.out.println(k2.toString()); // Efendileri 2023 Javanin


    }

}
