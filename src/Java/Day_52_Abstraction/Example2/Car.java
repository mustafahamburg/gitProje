package Java.Day_52_Abstraction.Example2;

public abstract class Car {
   protected String name;
   protected static int age;
   private double motorGucu;
   abstract void yakit();
   abstract int tekerSayisi();

   Car(int motorGucu){
       this.motorGucu=motorGucu;
   }


}
