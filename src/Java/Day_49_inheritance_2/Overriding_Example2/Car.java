package Java.Day_49_inheritance_2.Overriding_Example2;

public class Car extends Vehicle {
    @Override
    void yakit(double speed,double motorGucu){
        yakitMiktari+=speed+motorGucu*0.75;
    }

}
