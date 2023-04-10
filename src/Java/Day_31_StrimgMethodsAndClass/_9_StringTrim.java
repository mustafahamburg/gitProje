package Java.Day_31_StrimgMethodsAndClass;

public class _9_StringTrim {
    public static void main(String[] args) {
        String str="Merhaba Dunya";
        boolean b=str.isEmpty();
        System.out.println("b = " + b);// b = false

        boolean b1=str.startsWith("me");
        // startsWith--> verlen karakter ile mi basliyor..
        System.out.println("b1 = " + b1); // b1 = false
        // endsWith--> verlen karakter ile mi bitiyor.
        boolean b3=str.endsWith("ya");
        System.out.println("b3 = " + b3);// true

        // buyuk kucuk harf goz ardi ederek kontrol icin..
        boolean b2=str.equalsIgnoreCase("MERHABA DUNYA");
        System.out.println("b2 = " + b2); //b2 = true

        // trim() methodu bir stringdeki gereksiz boslulari silmeye yarar
        String str1="    Geliyor yeni SDET ler";
        str1=str1.trim();
        System.out.println("str1 = " + str1);
    }
}
