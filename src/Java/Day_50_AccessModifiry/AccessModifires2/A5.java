package Java.Day_50_AccessModifiry.AccessModifires2;

import Java.Day_50_AccessModifiry.AccessModifires1.A3;
import Java.Day_50_AccessModifiry.AccessModifires1.A4;

// Baska bir paketteki bir class dan obje create etmek icin paketin o class ini import ettik
public class A5 extends A4{
    public static void main(String[] args) {
        // A3 obje3=new A3();

       // obje3.name="isim";// Default degerli bir veriable default class modifire ise
                          // baska vbir paketten erisilemez

        A4 obje4=new A4();
        // Default constructor un access modifire si public dir,yoksa erisilemez

    }
}
