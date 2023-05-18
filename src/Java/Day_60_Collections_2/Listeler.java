package Java.Day_60_Collections_2;

import java.util.*;

public class Listeler {
    public static void main(String[] args) {
        List<String> sehirler=new ArrayList<>();

        sehirler.add("Oslo");
        sehirler.add("Istanbul");
        sehirler.add("Londra");
        sehirler.add(3,"Antalya");
        sehirler.set(0,"Bolu"); // eptade old. icin set methodunu kull.
        System.out.println("sehirler = " + sehirler);
        sehirler.clear();
        System.out.println("Clear dan sonra sehirler = " + sehirler);

        List<Integer>rakamlar=new LinkedList<>();  // Dubly olarak tutar,arraylist den hizli,
                                                   // daha hizli veri cagirmalarda kull.,tester e bakan yaniyok
        rakamlar.add(100);
        rakamlar.add(90);
        rakamlar.add(10);
        rakamlar.add(25);
        rakamlar.add(44);
        rakamlar.add(20);
        System.out.println("Linkedlisr olarak rakamlar = " + rakamlar);
        Collections.sort(rakamlar);
        System.out.println("Sord dan sonra rakamlar = " + rakamlar);


        List<String>ulkeler=new Vector<>(); // dahahantal bir yapi,daha eski ,10 arli depolama yapar,kullanissiz
    }
}
