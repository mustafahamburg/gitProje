package Java.Day_60_Collections_2;

import java.util.HashSet;

public class _02_hashSet {
    public static void main(String[] args) {

        HashSet<Integer>setA=new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(2);
        setA.add(4);
        setA.add(5);

        HashSet<Integer>setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
       // bu iki liste ile ilgili bazi methotlat uygulayalim

        // asagidaki metrhodlari cagiralim...
        System.out.println("Birlestirilmis hali = "+birlestir(setA,setB));
        System.out.println("Farki= "+farki(setB,setA));
        System.out.println("Ortak elementler= "+ortaklar(setA,setB));


    }
    public static HashSet<Integer>birlestir(HashSet<Integer>setA,HashSet<Integer>setB){
        HashSet<Integer>birlestirilmisHashSetler=new HashSet<>();
        birlestirilmisHashSetler.addAll(setA);
        birlestirilmisHashSetler.addAll(setB);

        // setA.AddAll(setB); bu sekilde eklenebilir
        return birlestirilmisHashSetler;
    }
    public static HashSet<Integer>farki(HashSet<Integer>setA,HashSet<Integer>setB){
        HashSet<Integer>fark=new HashSet<>(setA);
        fark.removeAll(setB);// burada iki liste farkini aldik
        return fark;
    }
    public static  HashSet<Integer>ortaklar(HashSet<Integer>setA,HashSet<Integer>setB){
        HashSet<Integer>ortakelementler=new HashSet<>(setA);
        ortakelementler.retainAll(setB); // burada
        return ortakelementler;
    }


}
