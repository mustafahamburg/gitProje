package Java.Day_49_inheritance_2.Overriding_Example;

public abstract class Employee {
    void geliriHesapla(int saat,double saatUcreti){  // sadece void ile de yazabiliriz
        System.out.println("Employee toplam geliri : " + (saat*saatUcreti));
    }

    abstract void  gelirHesapla(int saat, double saatUcreti);
}
