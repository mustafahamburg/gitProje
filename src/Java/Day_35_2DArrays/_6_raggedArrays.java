package Java.Day_35_2DArrays;

import java.util.Arrays;

public class _6_raggedArrays {
    public static void main(String[] args) {
        int [][]sayilar=new int[3][];  // ilk paranteez satirdir ve zorunlidur,sutun degisebilir.egal..
        System.out.println(Arrays.deepToString(sayilar));  // [null, null, null]

        int[] ciftsayilar={12,36,66};
        sayilar[1]=ciftsayilar; // array in ikinci elemanina deger atadik
        System.out.println(Arrays.deepToString(sayilar));//[null, [12, 36, 66], null]

        int[] tekSayilar={11,23,5,59};
        sayilar[0]=tekSayilar;// array in ilk elemanina deger atadik
        System.out.println(Arrays.deepToString(sayilar)); // [[11, 23, 5, 59], [12, 36, 66], null]

        int[] asalSayilar=new int[7];
        asalSayilar[0]=11;
        asalSayilar[1]=2;
        asalSayilar[2]=51;
        asalSayilar[3]=13;
        asalSayilar[4]=7;
        asalSayilar[5]=31;
        asalSayilar[6]=111;
        sayilar[2]=asalSayilar;// array in ucuncu elemanina deger atadik
        System.out.println(Arrays.deepToString(sayilar)); // [[11, 23, 5, 59], [12, 36, 66], [11, 2, 51, 13, 7, 31, 111]]
    }
}
