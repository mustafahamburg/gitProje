package Java.Day_59_Collections;

import java.util.ArrayList;
import java.util.List;

public class _01_Introduction_Collection {
    public static void main(String[] args) {
        List<String> sehirler=new ArrayList<>(); // bu bir polymorphism yapisi ile kurulan string liste
        sehirler.add("Samsun");
        sehirler.add("Agri");
        sehirler.add("Oslo");

        String ulkeler[]=new String[]{"Turkiye","Almanya","Hollanda","Avusturya"}; // Fixed size Array
        System.out.println("sehirler = " + sehirler); // sehirler bu sekilde yazdirilabilir
        System.out.println("sehirler.toString() = " + sehirler.toString());
        //System.out.println("ulkeler = " + ulkeler); // ulkeler bu sekilde yazdirilamaz
        //System.out.println("ulkeler.toString() = " + ulkeler.toString()); // boyle de olmaz
        for (String s:ulkeler){
            System.out.println("s = " + s); // for each ile yazdirilabilir

        }

    }
}

