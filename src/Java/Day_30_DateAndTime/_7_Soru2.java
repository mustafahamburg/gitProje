package Java.Day_30_DateAndTime;

import java.util.Scanner;

public class _7_Soru2 {
    public static void main(String[] args) {
      //  Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı ekrana sadece isim başHarf.
        //  soysimBasharf. şeklinde yazdırınız.
      //  yani Ahmet Yılmaz -> A.Y. olarak yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim ve soy isminizi giriniz");
        String girilenIsim= scan.next();

        for (int i =0; i <girilenIsim.length() ; i++) {
            if (girilenIsim.charAt(i)==' '){
                System.out.println(girilenIsim.charAt(0)+"."+girilenIsim.charAt(i+1)+".");
            }

        }
    }
}
