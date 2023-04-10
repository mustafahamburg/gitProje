package Java.Day_28;

import java.util.Random;

public class _4_betweenRandom {
    public static void main(String[] args) {
        // belirli bir aralikta rastgele deger yazdirmak istersek
        Random random=new Random();
        // Boundary
        int sayi= random.nextInt(30); // 30 dahil dgil
//********************************************************************
        // between olmasi icin Aralikli defger atama
       // int  arasindaBirDegerAtama= random.nextInt(Buyuk deger-Kucuk deger*1)+kucuk deger;--> DAHIL OLAN BUYUK DEGER
        int max=12;
        int min=1;
        int aralikliDegerAlma=(int) (Math.random()*(max-min)+1)+min; // buradaki random math class indan geliyor
        System.out.println("aralikliDegerAlma = " + aralikliDegerAlma);

        // Math olmadan yazilma sekli
        int rastgele;  // 12 ile 1 arasinda rastgele deger atamasi yapiyoruz

        rastgele=random.nextInt(12-1+1)+1;
        System.out.println("rastgele = " + rastgele);
        //****************************************************

        // 30 ile 99 arasinda int rastgele deger uretiniz
        int betweenDeger=random.nextInt((99-30)+1)+30;
        System.out.println("betweenDeger = " + betweenDeger);

        //***************************************************
        // Boolean rastgele deger atama sekli

    }
}
