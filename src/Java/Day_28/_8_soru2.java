package Java.Day_28;

import java.util.Random;
import java.util.Scanner;

public class _8_soru2 {
    public static void main(String[] args) {
        //Sayi(int) araligindaki MIN ve MAX degerleri kullanicidan aliniz.
        // Ardindan bu aralikta kullanicidan tahmin isteyiniz.
        // Bu tahmin ile random sayiyi kiyaslayarak
        // Tebrik veya uzgun mesajinizi yazdiriniz

        Scanner scan=new Scanner(System.in);
        Random ra=new Random();
        System.out.println("Lütfen tahmin araligi icin pozitif bir deger giriniz");
        int arlikMin= scan.nextInt();
        System.out.println("Lütfen tahmin araligi icin daha buyuk pozitif bir deger daha giriniz");
        int arlikMax= scan.nextInt();
        System.out.println("Lütfen tahmin ettiginiz sayiyi giriniz");
        int tahminSayisi=scan.nextInt();
        int uretilenSayi=ra.nextInt(tahminSayisi);
        System.out.println("tahminSayisi = " + tahminSayisi);
        System.out.println("uretilenSayi = " + uretilenSayi);

        String sonuc=(uretilenSayi==tahminSayisi)?"Basardiniz :), Tebrikler!" :"Üzgünüz :(,Tekrar Deneyiniz";
        System.out.println("sonuc = " + sonuc);


    }
}
