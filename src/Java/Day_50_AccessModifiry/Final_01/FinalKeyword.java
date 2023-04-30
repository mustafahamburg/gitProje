package Java.Day_50_AccessModifiry.Final_01;

public class FinalKeyword {
    public static final double PI=3.14; // Class ve final variable,baska bir deger almaz
    public static int sayi=12;

    public static void main(String[] args) {
        int sayi=15; // Local variable
        final double PI=3.15;  // Local final variable
        sayi=1;
       // PI=1.3; // Hata verir

        System.out.println("PI = " + PI); // buradaki pi local pi
        System.out.println("FinalKeyword.PI = " + FinalKeyword.PI);

    }
    public void methodFinal(){
       // PI=3.4; // Burada static keyword kaldirilarak statik olmayan bir methoda cafirdik
                // Baska bir deger alamiyor
                // Static kavrami sadece cagirilan yere kullanilmasi icin sart kosar
                // Final kavrami ile ilgili degildir,ancak final degeri olan bir degisken her yere
                // cagirilabilmesi ve tek deger almasindan dolayi static ile birlikte kull
        System.out.println("(PI*4) = " + (PI * 4));
    }
}
