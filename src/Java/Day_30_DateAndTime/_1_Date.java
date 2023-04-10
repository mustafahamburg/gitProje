package Java.Day_30_DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _1_Date {
    public static void main(String[] args) {

        // Date ve time zaman tanimlama icin kullanilan Date ve Localdate
        Date date=new Date();
        System.out.println(date);  // Mon Mar 27 19:26:35 CEST 2023
        // Ayni Scanner da kullanilan System.in gibi sizin bilgisayardakibilgileri olkur
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);    // tarih = 2023-03-27
        System.out.println("tarih.getYear() = " + tarih.getYear());    //  2023
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());   //  27
        System.out.println("tarih.getMonth() = " + tarih.getMonth());     // MARCH
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());   //  MONDAY

        tarih.format(DateTimeFormatter.ISO_DATE);
        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd/MM/yyy");
        // formati istedigimiz sekilde ayarlayabiliriz
        System.out.println("ozelFormat = " +tarih.format(ozelFormat) );  //  27/03/2023

    }
}
