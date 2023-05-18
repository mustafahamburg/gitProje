package Java.Day_60_Collections_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _01_HashSet {
    public static void main(String[] args) {
        int a=5; // hafizada bir yer tutar
        int[]dizi=new int[3]; // 3 elementlik yer tutar
        int[]dizi1={3,4,5};
        int tablo[][]=new int[4][4]; // 2D array old. icin -16 lik yer tutar
        // Element sayisina gore dinamik sekilde yer tutma altyapisini saglayan listeler:
        List<Integer> sayilar=new ArrayList<>();         // bir listeyi dinamik halde tutar
        List<List<String>>isimListesi=new ArrayList<>(); // dinamik listelerin tutuldugu liste

        ArrayList<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(34);
        rakamlar.add(4);
        rakamlar.add(35);
        rakamlar.add(45);
        rakamlar.add(5);
        rakamlar.add(5);
        System.out.println("rakamlar.size() = " + rakamlar.size());
        System.out.println("rakamlar = " + rakamlar);
        // Burada tekrarli elemetler de yazdirilir

        // Hashset tekrarlanan elementleri yazdirmaz ve listeye eklemez .Bos yere element olusturmaz,Refere eder
        HashSet<Integer>integerHashSet=new HashSet<>();
        integerHashSet.add(24);
        integerHashSet.add(5);
        integerHashSet.add(4);
        integerHashSet.add(24);
        integerHashSet.add(35);
        integerHashSet.add(9);
        integerHashSet.add(9);
        integerHashSet.add(24);
        System.out.println("integerHashSet.size() = " + integerHashSet.size());
        System.out.println("integerHashSet = " + integerHashSet);

        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Black");
        renkler.add("Blue");
        renkler.add("black");
        renkler.add("Black");
        System.out.println("renkler = " + renkler); // birinci yazdirma yomtemi

        for (String s:renkler){      // birinci yazdirma yomtemi
            System.out.println("s = " + s);
        }
      /*  Iterator gosterge=  renkler.iterator();  // 3. yazdirma sekli
        while (gosterge.hasNext()){  // sonraki eleman var mi
           if (gosterge.next()=="Blue"){ // iterator interface sinifinin sonraki elementini cagirdik
                                         // ve blue ile verify ettik
               gosterge.remove(); // iteratora ait silme yaptik
           }
        }
        System.out.println("while sonrasi renkler = " + renkler);
        renkler.remove("Red");
        System.out.println("renkler = " + renkler);
        renkler.clear();
        System.out.println("renkler = " + renkler);

       */




    }
}
