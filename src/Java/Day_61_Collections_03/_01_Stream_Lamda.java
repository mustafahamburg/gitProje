package Java.Day_61_Collections_03;

import java.util.List;
import java.util.Stack;

public class _01_Stream_Lamda {
    public static void main(String[] args) {
        // a->a... : Lamda isareti
        // Stream ve Lamda ile bir seri uzerindeki akisi ifade eden ve farkli method lari uygulamamizi
        // kisa bir yoldan uygulamamizi saglar.

        List<String>sehirler=new Stack<>();
        sehirler.add("Istanbul");
        sehirler.add("Izmir!");
        sehirler.add("Bolu");
        sehirler.add("Urfa");
        sehirler.add("Antep!");
        sehirler.add("Diyarbakir");

        sehirler.stream().forEach(x ->{System.out.println("Merhaba Stream");System.out.println(x.toString());});
        sehirler.forEach(a-> System.out.println(a));

        System.out.println(sehirler.stream().filter(z->z.contains("!")).count()); // 2
        // Yikarida ; bir listenin filtreleme parametresini diledigimiz gibi belirliyor ve
        // sonrasinda bu filtreli elementleri kullaniyoruz, ! isareti icern 2 tane element var.
    }
}
