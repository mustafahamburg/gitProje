package Java.Day_52_Abstraction.Example2;

import java.util.Scanner;

public class Mercedes extends Car{

    Mercedes(int motorGucu) {
        super(motorGucu);
    }

    @Override
    void yakit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Arac elektrikli mi?");
        boolean aracElektrikliMi= sc.nextBoolean();
        if (aracElektrikliMi){
            System.out.println("Dusuk yakit");
        }else
            System.out.println("Yuksek yakit");
    }
    @Override
    int tekerSayisi() {
        return 10;
    }
    public static int kapiSayisi(){
       if ((age>30)){
           return 2;
       }else
           return 4;
    }
    public static void main(String[] args) {
        Mercedes mercedes1=new Mercedes(12);
        mercedes1.yakit();

        mercedes1.name="S serisi";
        System.out.println(mercedes1.name);
        System.out.println(mercedes1.tekerSayisi());
        age=32;
        System.out.println(kapiSayisi());
    }
}
