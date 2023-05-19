package Java.Day_61_Collections_03;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class _intro_Map {
    public static void main(String[] args) {
         // HashMap<>() te; Hash depolama bicimini ,Map ise deger yapisi ni gosterir
        Map<Integer,Integer>map=new HashMap<>(); // Map objesi Key ve Value degerlerini alarak olusur
        map.put(2,11);
        map.put(3,12);
        map.put(4,13);
        map.put(5,18);
        map.put(8,56);
        map.put(2,51); // burada 2 key degerine ait value guncellendi
        map.put(9,51); // farkli key ler ayni degere sahip olabilir,amma farkli degerler ayni kei alamaz
        map.put(50,123);
        map.put(25,121);
        map.put(10,123);

        System.out.println("map = " + map);// map = {2=51, 50=123, 3=12, 4=13, 5=18, 8=56, 9=51, 25=121, 10=123} cikti boyle

        // foreach ile Value yazdirma
        for (Integer value:map.values()) {
            System.out.println("value = " + value);
        }
        // foreach ile Key yazdirma
        for (Integer value:map.keySet()) {
            System.out.println("value = " + value);
        }



    }
}
