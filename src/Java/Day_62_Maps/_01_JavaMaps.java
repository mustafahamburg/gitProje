package Java.Day_62_Maps;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMaps {
    public static void main(String[] args) {
        Map<String,String > bilalBeyKartvizit=new HashMap<>();
        bilalBeyKartvizit.put("isim","Bilal Saglam");
        bilalBeyKartvizit.put("e-mail","bilal_saglam@gmail.com");
        bilalBeyKartvizit.put("adres","Frankfurt/Almanya");
        bilalBeyKartvizit.put("telefon","0 535 454 0000");

        //bilalBeyKartvizit.get("isim")--> bu cagirildiginda ,bu key ile tanimlanan value gelir

        System.out.println("bilalBeyKartvizit.get(\"isim\") = " + bilalBeyKartvizit.get("isim"));
        System.out.println("bilalBeyKartvizit.get(\"telefon\") = " + bilalBeyKartvizit.get("telefon"));


        Map<String,String > ismailBeyKartvizit=new HashMap<>();
        ismailBeyKartvizit.put("isim","ismail demir");
        ismailBeyKartvizit.put("e-mail","ismail_demir@gmail.com");
        ismailBeyKartvizit.put("adres","Stutgart/Almanya");
        ismailBeyKartvizit.put("telefon","0 535 411 0000");

        System.out.println("ismailBeyKartvizit.get(\"isim\") = " + ismailBeyKartvizit.get("isim"));
        System.out.println("ismailBeyKartvizit.get(\"telefon\") = " + ismailBeyKartvizit.get("telefon"));

        Map<String, Map<String,String>>kartvizitler=new HashMap<>(); // Bu kartvizitler eklemeye yarar
        kartvizitler.put("bilal",bilalBeyKartvizit);
        kartvizitler.put("ismail",ismailBeyKartvizit);

        System.out.println("Bilal in telefonu : "+kartvizitler.get("bilal").get("telefon"));

        System.out.println("kartvizitler.get(\"ismail\") = " + kartvizitler.get("ismail"));
        System.out.println("kartvizitler = " + kartvizitler);


    }
}
