package Java.Day_60_Collections_2;

import java.util.HashSet;
import java.util.Iterator;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>h1; // sadece int degerleri element olarak alir
        HashSet<Object>hsObject=new HashSet<>(); //
        HashSet hs2Obje=new HashSet<>(); // bu default olarak obje hashset listesi olusturur üsttekinin ayni gorevi gorur
        hs2Obje.add(5);
        hs2Obje.add("Bilal");
        hs2Obje.add("ismail");
        hs2Obje.add(34);

        HashSet<Integer> h3=new HashSet<>();
        h3.add(1);
        h3.add(2);
        h3.add(34);
        h3.add(5);
        // yazdirma islemi
        for (int e:h3) {
            System.out.println("e = " + e);
        }
        for (Object o:hs2Obje){
            System.out.println("o = " + o);
        }

        Iterator gosterge=h3.iterator();  // bu interface olarak buraya kopyaliyor
        while (gosterge.hasNext()){
            Integer eleman=(Integer) gosterge.next();// Daha once Wrapper class integer olan element
                              // Iteraror interface donusturulmustu,tekrardan integer a cevirdik
            if (eleman==34){
                gosterge.remove();
                System.out.println("Bu element artik yok ");
            }
        }

    }
}
