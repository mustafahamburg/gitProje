package Java.Day_36_WrapperClasses;

public class _1_introWrapper {
    public static void main(String[] args) {
        // Program sadece rakam,harf veya true-false gibi basit degerler hafizada saklayarak
        // cok fazla yer kaplamasin diye ayni basit tipteki degiskenler kullandi.
        // Bu degiSKENLERE pRIMITIVE TYPE VEYA field olarak adlandirmistik

        int a=4; // hafizada bir rakam yer tuttu,buna basit tip deger denir
        Integer b=5; // Wrapper Class olarak ifade edilen  classlardan inteer olani
                     // bu Integer digerlerinden farkli olarak tum detaylariyla tanimlanmis oluyyor
        // Method ,fiels ,class a ait tanimli hersey gelmis oluyor
        // Wrapper class kucuk harf ile tanimlanana basit yer tutan degiskenlerin buyuk hargle
        // yazilmasi durumunadenir .tum detaylari ile tanimlanmis olur.Her biri Class tir

        int number1=5;
        Integer num2=new Integer(5); // bu sekilde tanimlanmasi durumunda deger atanmalidir,
                                     // kirmizi cizgi sorun degil surumle alakali bir durum
        Integer num3=new Integer("5"); // String bir deger atayabiliyoruz

        // Wrapper class lar object karsilastirmasi yapar
        // equals() objectlerin degerlerini karsilastirir
        // == ise Objectlerin referanslarini karsilastirir

        System.out.println(num2.equals(num3)); // true
        System.out.println(num2==num3);        // false
        System.out.println(num2+num3);  // 10

        double dd=2;
        double d1=25.5;
        Double d2=new Double(20); // Wrapper class ile deger atadik
        Double d3=new Double("23.3");
        Double d4=new Double(20.4);
        System.out.println("dd = " + dd);
        System.out.println("d1 = " + d1);
        System.out.println("d3 = " + d3);
        System.out.println("d2 = " + d2);
        System.out.println("d4 = " + d4);
        System.out.println(d1+d2+d3+dd+d4);//91.19999999999999

        char ch1='c';
        Character ch2=new Character('c');
        // Character ch2=new Character("c"); // String olarak Constructer deger parametresi olmadigi icin
        // String deer atanmasi mumkun degildir
        System.out.println("ch2 :"+ch2);// ch2 :c

        // Wrapper classlar parametreli atandigi icin defoult deerleri yoktur







    }
}
