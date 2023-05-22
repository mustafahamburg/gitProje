package Java.Day_62_Maps;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _03_Example {
    public static void main(String[] args) {

        List<Integer> items=new ArrayList<>();
        items.add(12);

        Map<String,Double> items2=new HashMap<>();
        items2.put("Apple",2.69);
        items2.put("Egg",9.43);
        items2.put("Flowers",11.99);
        items2.put("Milk",5.25);
        items2.put("Apple",7.75); // burada yeni bir obje eklenmiyor sadece value degisiyor

        System.out.println("items2.size() = " + items2.size()); // bu bize HashMap in uzunlugu
                                                                // yani obje sayisini verir
        System.out.println(items2); // toString methoduna ihtiyac duymadan yazdirir

        System.out.println("items2.isEmpty() = " + items2.isEmpty());
        System.out.println("items2.get(\"Apple\") = " + items2.get("Apple"));
        System.out.println("items2.get(\"Milk\") = " + items2.get("Milk"));

        items2.remove("Flowers");
        System.out.println(items2);

        items2.replace("Egg",3.5); // put ile yeniden deger atama gibi bu sekilde olur

        System.out.println("Price of egg : "+items2.get("Egg"));

        items2.put("Milk",2.45);
        System.out.println("Price of milk : "+items2.get("Milk"));

        items2.replace("Egg",items2.get("Egg")+3); // burada deger atamasini bir artis veya azalis
                                                   // increase veya decrease hale getirebiliriz
                                                   // 3 artirdik fiyatlari
        //System.out.println(items2);
        //Her bir objenin tek tek yazdirilmasini istersek ;Lambda ile yazdirabiliriz
        items2.forEach((k,v)-> System.out.println(k+" | "+v));






    }
}
