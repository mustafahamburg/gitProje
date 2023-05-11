package Java.Day_57_Error_Exception_01;

import java.util.Scanner;

public class _07_TryChatchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Hatanin olma ihtimali olan kodlar bu blok ta yer alir
        try {
            System.out.println("birinci sayiyi giriniz");
            int sayi1= sc.nextInt();
            System.out.println("ikinci sayiyi giriniz");
            int sayi2= sc.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("Bolum:" + bolum);

        } // Hata olma durumunda calisacak bolum
        catch (Exception ex){
            System.out.println("Hata oldu");
            System.out.println("ex.getMessage() = " + ex.getMessage());
            ex.printStackTrace();  // printStackTrace() methodu ; Konsolda hata oldugunda yazdirilan
                                   // kirmizi detaylari yazdirir
        }
    }
}
