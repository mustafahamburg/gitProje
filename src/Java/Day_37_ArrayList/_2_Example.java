package Java.Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _2_Example {
    public static void main(String[] args) {
        // Arraylist bir Colection grubunun bir elemanidir
        //Sort ile burada da siralama yapiliyor ama Collections,sort(list);

        // bir integer array olusturalim
        ArrayList<Integer> rakamlar=new ArrayList<>()
        {
            {
                add(3);   // bu sekilde suslu parantez icinde ekleme de yapilabilir
                add(12);
                add(1);
                add(24);
            }
        };
        rakamlar.add(9);
        System.out.println("ilk haldeki rakamlar = " + rakamlar);//[3, 12, 1, 24, 9]

        // .sort() ile siralama yapilir arraylerde
        Collections.sort(rakamlar);
        System.out.println("sort sonrasi rakamlar = " + rakamlar);// [1, 3, 9, 12, 24]

        // listeyi tersine cevirme:
        Collections.reverse(rakamlar);
        System.out.println("listenin tersi rakamlar = " + rakamlar);//[24, 12, 9, 3, 1]

        // tum elemanlara tek bir deger atama
        Collections.fill(rakamlar,8);
        System.out.println("tum elemanlarqa ayni deger atanmasi rakamlar = " + rakamlar);//[8, 8, 8, 8, 8]

        // listedeki elemanlari degistirme
        Collections.replaceAll(rakamlar,8,9);
        System.out.println("yeniden degerr atanan rakamlar = " + rakamlar);//[9, 9, 9, 9, 9]


    }
}
