package Java.Day_61_Collections_03;

import java.util.Arrays;
import java.util.HashSet;

public class _03_Lambda_Stream {
    public static void main(String[] args) {

        Integer[]dizi={1,3,2,5,6,7,9};
        // 1-Burada hashset olarak bir dizi atayarak tanimladik,cast ..
       // HashSet<Integer>hs=(HashSet<Integer>) Arrays.asList(dizi);

        HashSet<Integer>hs1=new HashSet<>();
        hs1.addAll(Arrays.asList(dizi));  // bu cast olmadan ekleme islemini yaptik

        // talk()--> bu method ile yazdirma islemi yapabiliyoruz
        //hs1.stream().foreach(user::talk); bu syntex ile fonksiyonun sadece adi yazilir
        // "talk()" degil "talk" olarak yazilir ve "::" seklinde yazilarak kull.
        hs1.stream().forEach(user-> System.out.println(user.hashCode()));


    }
}
