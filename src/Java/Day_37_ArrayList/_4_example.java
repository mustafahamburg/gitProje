package Java.Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_example {
    public static void main(String[] args) {
        // Bir ogretmenden istedigi kadar not aliniz ve alinan notlarin
        // ortalamasini gecen ogrenci sayisini bulunuz
        ArrayList<Integer> notlar = new ArrayList<>();

        Scanner scNot = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String devamMi; // do nun icinde olursa while de kullanamayiz,o yuzden buraya...
        int sum = 0;
        do {
            System.out.println("Lutfen not giriniz");
            int ogrNot = scNot.nextInt();
            notlar.add(ogrNot); // kullanicinin notunu listeye atadik
            sum += ogrNot;
            System.out.println("Devam mi?:E/H");
            devamMi = scanner.nextLine();


        } while (devamMi.equalsIgnoreCase("E"));
        double ortalama = sum / notlar.size();
        int ogrSayisi=notlar.size();
        int counter = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) >= ortalama) {
                counter++;
            }

        }
        System.out.println("notlar = " + notlar);
        System.out.println("ortalama = " + ortalama);
        System.out.println(ogrSayisi+" ogrenciden Ortalamayi gecen ogrenci sayisi = " + counter);
    }
}