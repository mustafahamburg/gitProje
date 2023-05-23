package Java.Day_58_ErrorException_02;

import java.util.Scanner;

public class _03_TrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Kullanici adi giriniz");
        String userName= oku.nextLine();
        /*
        if (userName.length()<6){
            System.out.println("Kullanici adi 6 karakterden az olamaz");
        }
        if (userName.length()>10){
            System.out.println("Kullanici adi 10 karakterden fazla olamaz");
        }
        */

        try {
            if (userName.length()<6)
                throw new Exception("Kullanici adi 6 karakterden az olamaz");
            // throw ile kendimiz hata olusturuyoruz.Böylece kriterleri saglamayan durumlar icin
            // catch bloguna dusurerek pratik bir kullanim saglamis oluyoruz

            if (userName.length()>10)
                    throw new Exception("Kullanici adi 10 karakterden fazla olamaz");
        }catch (Exception ex){
            System.out.println("Hata: "+ex.getMessage());
            // log tututyor,kimler hata yapmis,ne zaman ,ne tur  gibi...
            // bir cok kontrol tek yerde tututluyor
        }
        try {
            Thread.sleep(1000); // bir saniye demek
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Thread bir is parcasi ,JVM deki Pause tusuna basmak gibi durdurma anlami tasir
    }
}
