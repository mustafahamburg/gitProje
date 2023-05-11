package Java.Day_57_Error_Exception_01;

import java.time.LocalDate;
import java.time.Month;

public class _04_TryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        try {
            System.out.println("Tarih set ediliyor");
            LocalDate date=LocalDate.of(2023, Month.MAY,40);
            System.out.println("Islem tamam");
        }catch (Exception e){
            System.out.println("Verilen egerleri kontrol ediniz");
            System.out.println("Ay 1-31 arasi deger alabilir");

            System.out.println("e.getMessage() = " + e.getMessage()); // hatanini mesaji
                                                                      // Exeption class indan olusan obje ile
                                                                      // hatanin mesajini almamizi saglar

        }
    }
}
