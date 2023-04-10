package Java.Day_37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _1_ArrayList {
    public static void main(String[] args) {
       //Arrays--> tum dizilerin icindeki fonksiyonlari barindirir
       // ArrayList ise Collection altinda yer almaktadir

         int[]sayilar={1,3,5,6};

        ArrayList<String>isimler=new ArrayList<String>();//Bir arraylist tanimladik.// ArrayList sadecewrapper class lar ile calisir
        ArrayList<Integer>sayiList=new ArrayList<>();
        ArrayList<Boolean>bouleanList=new ArrayList<>();
        ArrayList<Double>doubleList=new ArrayList<>();

        System.out.println("eleman atamadan isimler = " + isimler); // []

        isimler.add("ali");
        isimler.add("veli");
        isimler.add("selim");
        isimler.add("velit");
        System.out.println("eleman atayinca isimler = " + isimler); //[ali, veli, selim, velit]

        // Eleman sayisi bulma:
        int elemanSayisi= isimler.size();
        System.out.println("elemanSayisi = " + elemanSayisi); // 4

        String elementDegeri=isimler.get(2); // ikinci indexteki elemani getirir
        System.out.println("elementDegeri = " + elementDegeri);//selim

        // Index olarak eleman atama
        isimler.set(2,"kerim");
        // isimler.set(4,"taha"); // olmayan indexe eleman atAYAMIYORUZ,yeni yer acamiyoruz
        System.out.println("isimler = " + isimler);

        // Bir elemanin indesxini bulma
        int indexdegeri=isimler.indexOf("velit");
        System.out.println("indexdegeri = " + indexdegeri); // 3

        // eleman var mi yok mu?
       boolean elementCheck= isimler.contains("mustafa");
        System.out.println("elementCheck = " + elementCheck); // false
        // dizi bos mu?
        boolean isEmpty= isimler.isEmpty();
        System.out.println("isEmpty = " + isEmpty); // false
        // Eleman silme;indexe gore/eleman degerine gore
        System.out.println("isimler = " + isimler);// silme oncesi  [ali, veli, kerim, velit]
        System.out.println("isimler.remove(\"veli\")="+isimler.remove("veli")); // elemana gore silme  true
        System.out.println("ilk remove sonrasi isimler= "+isimler);// [ali, kerim, velit]
        System.out.println("isimler.remove2= "+isimler.remove(2));// index e gore silme
        System.out.println("ilk remove sonrasi isimler= "+isimler); // [ali, kerim]


    }
}
