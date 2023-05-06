package Java.Day_45_Static_01;

import java.util.concurrent.Callable;

public class CalculatorTest {
    public static void main(String[] args) {
       Calculator obje1=new Calculator();
        System.out.println(obje1.plus(4,5)); // obje ile static olanbir method cagirdik
        System.out.println(Calculator.plus(4,15)); //Class ismi ile static olanbir method cagirdik

        int i=Integer.parseInt("33");  // stringi int e cevrr
        System.out.println(i*5);
        System.out.println(Character.isDigit('4'));//char olan karakterin sayi olup olm...

        CalculatorTest ct=new CalculatorTest();
        // 1. yontem buradaki methodu cagirmak icin
        ct.m4(); // sinifa ait bir method oldugundan bu sinifin bir objesi lazim

        // 2. yontem
        m4();
        // 3. yontem
        CalculatorTest.m4(); // classismi ile cagirdik
    }
    public static void m4(){
        System.out.println("Geliyor yeni sdet ler");
    }
}
