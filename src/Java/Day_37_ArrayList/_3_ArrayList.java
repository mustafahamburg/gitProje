package Java.Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_ArrayList {
    public static void main(String[] args) {
        // Deger atamanin farkli bir sekli
        ArrayList<Integer>sayilar=new ArrayList<>(Arrays.asList(15,4,6,11,44,87));
        System.out.println("dizinin eleman sayilar = " + sayilar.size()); // 6

        sayilar.add(32);
        sayilar.add(sayilar.size()); // eleman sayisini yeni eleman olarak ekledik
        System.out.println("yeni eklemeler sonrasi sayilar = " + sayilar);// [15, 4, 6, 11, 44, 87, 32, 7]

    }
}
