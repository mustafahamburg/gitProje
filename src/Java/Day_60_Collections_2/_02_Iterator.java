package Java.Day_60_Collections_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_Iterator {
    public static void main(String[] args) {

        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("Gulden");
        isimler.add("Selim");
        isimler.add("Ramazan");
        isimler.add("Symbat");
        isimler.add("Ayse");
        isimler.add("Bilal");
        isimler.add("Ismail");
        isimler.add("GuldenT");

        Iterator itr=isimler.iterator();
    }
}
