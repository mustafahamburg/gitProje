package Java.Day_28;

import java.util.Random;

public class _3_Random_rastgele {
    public static void main(String[] args) {
        // Random=rastgele sayi demek
        Random r=new Random();

        // INT deger atamasi icin
        int intRandom=r.nextInt();
        System.out.println("intRandom = " + intRandom);

        // Double deger atamasi icinm
        double doubleRandom=r.nextDouble();  // 0.0<=dandom double < 1.0  daima bu aralik
        System.out.println("doubleRandom = " + doubleRandom);

        int sinirliRandomSayi=r.nextInt(30); // 0 ile yazdigimiz sayi arasi ,yazilan dahil degil
        System.out.println("sinirliRandomSayi = " + sinirliRandomSayi);

        // Random degerleri 0 ile 1 arasinda uretilir
        // Math class indan
        double randomDouble=Math.random()*10;
        System.out.println("randomDouble = " + randomDouble);
        int intRandomSayi=(int)randomDouble;
        System.out.println("intRandomSayi = " + intRandomSayi);



    }
}
