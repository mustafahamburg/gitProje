package Java.Day_28;

import java.util.Random;

public class _7_soru1 {
    public static void main(String[] args) {
        //50 ile 99 sayilari arasinda (99 DAHIL)
        // rastgele bir TEK sayi Degeri
        // ciktisini veren programi method ile yaziniz

        rastgeleTekSayiVer(99,50);
    }
    public static int rastgeleTekSayiVer(int max,int min) {
        Random random = new Random();
        int sayi = (int) (Math.random() * (max - min) + 1) + min;

        while (sayi % 2 == 1) {
            System.out.println("Verilen Tek Sayi = " + sayi);
            break;
        }
        return sayi;
    }
}
