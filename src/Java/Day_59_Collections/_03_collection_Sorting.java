package Java.Day_59_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _03_collection_Sorting {
    public static void main(String[] args) {
        List<String>cities=new ArrayList<>();
        cities.add("Hamburg");
        cities.add("Berlin");
        cities.add("Munschen");
        cities.add("Lubeck");
        cities.add("Rocksock");
        System.out.println("Before Sorting : "+cities);
        Collections.sort(cities);  // Alfabetik siralama yapar
        System.out.println("After Sorting : "+cities);

        cities.get(0); // .get() --> verilen index teki elemani cagirir,getirir
        System.out.println(cities.get(0));
        cities.get(3);
        System.out.println(cities.get(3));

        cities.set(3,"Dorthmund"); // .set() --> Verilen index teki degeri degistirir
        System.out.println(cities);

        cities.remove(0); // .remove() --> Verilen index teki degeri siler
        System.out.println(cities);

        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("New York");
        arrayList.add("Ankara");
        arrayList.add("Larnaca");
        cities.addAll(arrayList); // .addAll()--> bir liste direkt olarak eklenebilir
        System.out.println("AddAll sonrasi: "+cities);

        cities.removeAll(cities); // .removeAll() --> tum elementleri siler
        cities.clear();           // .clear() --> tum listeyi siler,kaplari ile birlikte ...

        ArrayList<Integer>integerArrayList=new ArrayList<>();
        integerArrayList.add(45);
        integerArrayList.add(4);
        integerArrayList.add(142);
        integerArrayList.add(63);
        integerArrayList.add(12);
        System.out.println("Sorting oncesi: "+integerArrayList);

        Collections.sort(integerArrayList);
        System.out.println("Sorting sonrasi: "+integerArrayList);

    }
}
