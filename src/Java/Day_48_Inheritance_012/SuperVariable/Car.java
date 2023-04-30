package Java.Day_48_Inheritance_012.SuperVariable;

public class Car extends Vehicle{
    int maxSpeed=180;
    public void display(){
        System.out.println("maximum hiz: "+maxSpeed);  // yukaridaki (child class) maxspeed
        System.out.println("maximum hiz: "+super.maxSpeed);// super class daki (parent) maxspeed
    }
}
