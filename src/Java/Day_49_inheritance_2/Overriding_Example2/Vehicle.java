package Java.Day_49_inheritance_2.Overriding_Example2;

public class Vehicle {
    String name;
    String make;
    int year;
    double yakitMiktari;


    void yakit(double speed,double motorGucu){
       yakitMiktari+=(speed*0.01+motorGucu*0.75);
    }


}
