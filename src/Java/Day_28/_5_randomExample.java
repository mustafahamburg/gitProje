package Java.Day_28;

import java.util.Random;
import java.util.Scanner;

public class _5_randomExample {
    public static void main(String[] args) {
        // kullanici tarafindan belirlenen sinir ile rastgele sayi(int) uretilsir
        // ve ayrica kullanicidan sayi tahmini alinsin.esit olmasi durumunda tebriklerr yazdirin
        Scanner scan=new Scanner(System.in);
        Random ra=new Random();
        System.out.println("Rastgele sayilar icin sinir belirleyiniz:");
        int sinirSayisi= scan.nextInt();
        int uretilenSayi=ra.nextInt(sinirSayisi);

        System.out.println("Lütfen tahmin ettiginiz sayiyi giriniz");
        int tahminSayisi=scan.nextInt();

        if (uretilenSayi==tahminSayisi){
            System.out.println("Bravo Tebrikler");
        }else {
            System.out.println( uretilenSayi=ra.nextInt(sinirSayisi));
            System.out.println("Bilemedin ki,Bilemedin ki");
        }
       // ternary ile ...
        String sonuc=(uretilenSayi==tahminSayisi)?"Bravo Tebrikler" :"Bilemedin ki,Bilemedin ki";
        System.out.println("sonuc = " + sonuc);
    }
}
