package Java.Day_35_2DArrays;

import java.util.Arrays;
import java.util.Random;

public class _4_examples {
    public static void main(String[] args) {
        // dort ogrencinin dort dersten aldigi notlari gosteren int bit 2D creat edin
        // 10 ile 100 arasinda degerler verin,ardindan her ogrenci icin


        int[][]scores=new int[4][4];
        for (int i = 0; i < scores.length; i++) {  // satir
            for (int j = 0; j < scores[i].length; j++) {  // sutun
                Random rd=new Random();
                scores[i][j]=rd.nextInt(100-10+1)+10;
            }
        }
        // method ile yazdirma,for each kullanarak
        System.out.println("2D Arraylerin yazdirma methodu ile ciktisi:"+ Arrays.deepToString(scores ));

        // bilinen tek boyutlu dizi bilgisiyle yazdirma
        for (int[]score:scores){
            System.out.println(Arrays.toString(score)); //[82, 71, 20, 75]
                                                      //  [76, 92, 92, 70]
                                                       // [80, 32, 62, 47]
                                                       // [48, 48, 81, 41]
        }

    }
}
