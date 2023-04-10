package Java.Day_35_2DArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3_2DPrint {
    public static void main(String[] args) {
        String[]kelimeler={"Bilal","Ahmet","Mehmet"};

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.print(kelimeler[i]+" ");
        }
        System.out.println("");
        // for each ile
        for (String s:kelimeler){
            System.out.print(s+" ");
        }
        System.out.println("");
        // toString methodu ile
        System.out.println(Arrays.toString(kelimeler));

        int[][]tablo1={{1,2,3},{4,5,3},{2,7,9}};
        for (int i = 0; i < tablo1.length; i++) {  // satir
            for (int j = 0; j < tablo1.length; j++) {  // sutun
                System.out.println("tablonun degerleri:"+tablo1[i][j]);
            }
        }
        // Lenght...
        int[]sayi={1,4,36,6,8};
        System.out.println(sayi.length); // 5

        int[][]sayilar1={{1,3,5,66},{2,4,6},{3,6}};
        System.out.println("sayilar1 = " + sayilar1);//sayilar1 = [[I@6acbcfc0
        System.out.println("sayilar1.length = " + sayilar1.length); // 3  yani 3 elemani var3 tane suslu parantez
        System.out.println("sayilar1[0].length = " + sayilar1[0].length); //4   ilk elemanin eleman sayisi
        System.out.println("sayilar1[2].length = " + sayilar1[2].length); //2  2. elemanin eleman sayisi
    }
}
