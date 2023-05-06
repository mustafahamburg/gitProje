package Java.Day_45_Static_01;

public class Car {
    int door;   // default

    public static void run(){
        System.out.println("Car is running");
    }
    public int getDoorNumber(){
        return door+2;
    }
}
class CarTest{
    public static void main(String[] args) {
        Car c=new Car();
        c.run();
        Car.run();

        System.out.println("c.getDoorNumber()*5 = " + c.getDoorNumber() * 5);
    }

}