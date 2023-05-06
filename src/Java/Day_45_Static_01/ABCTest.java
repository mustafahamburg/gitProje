package Java.Day_45_Static_01;

public class ABCTest {
    public static void main(String[] args) {
        ABC s1=new ABC(); // bir obje olusturduk
        ABC s2=new ABC();

        // Static keyword:
        // 1-Fields ile kullanildiginda sadece class ismi ile erisilma imkani olur
        // ve sadece class a ait degiskenlere static verebiliyoruz
        // 2-Static biir merthod sadece static bir method cagirabilir

        ABC.m1();// burada class ismi ile static method cagirdik
        s2.m2(); // burada obje methodu cagirdi.
        // ABC.m2(); bu sekilde static olmayan methodu cagiramayiz
    }
}
