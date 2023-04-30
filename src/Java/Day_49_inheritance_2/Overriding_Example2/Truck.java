package Java.Day_49_inheritance_2.Overriding_Example2;

public class Truck extends Car {  // extends edilmis bir class da extends edilebilir
    @Override
    void yakit(double speed,double motorGucu){
        yakitMiktari+=(speed*0.01+motorGucu*0.75);
        System.out.println("yakitMiktari = " + yakitMiktari);
    }

    public static void main(String[] args) {
        Truck t1=new Truck();
        t1.yakit(5,12);
    }

}
