package Java.Day_58_ErrorException_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_Multiply_TryCatch {
    public static void main(String[] args) {
        // Kullanicidan bes kez ikiser adet sayi alip bolum sonucunu ekrana yazdirsin
        // olusabilecek tum hatalari try-catch ile handle etsek...

        for (int i = 0; i < 5; i++) {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("1. sayiyi giriniz");
                int sayi1= sc.nextInt();
                System.out.println("2. sayiyi giriniz");
                int sayi2= sc.nextInt();
                int bolum=sayi1/sayi2;
                System.out.println("kullanicidan alinan iki sayinin bolum degeri:"+bolum);

            }catch (InputMismatchException ex){  //ör: sayi yerine harf girince olusabilecek hatalar icin kull
                System.out.println("Lutfen sayi giriniz");
                i--;
            }catch (ArithmeticException ex){
                System.out.println("2. sayi sifir olamaz");
                i--;
            }



        }

    }
}
