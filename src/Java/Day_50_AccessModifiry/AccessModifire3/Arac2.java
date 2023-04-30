package Java.Day_50_AccessModifiry.AccessModifire3;

import Java.Day_50_AccessModifiry.AccessModifires2.Arac;

public class Arac2 extends Arac{
    protected Arac2(){
        Arac araba=new Arac();
        System.out.println("engine=2.4 = " + (engine = 2.4));
    }
    protected double test3(){
        return engine=3.6;
    }
}
