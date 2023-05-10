package Java.Day_56_Ploymorphism_2;

public class DownCasting {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1(); // Polymorphic yapi
        animal1.saund();    // sadece parent class indaki methodlari calistirir

        Dog1 dog1=(Dog1) animal1;
        dog1.eat("ETCIL oldugu icin ");
        dog1.sound();

    }

}
class Animal1{
    public void saund(){
        System.out.println("Hayvanlar ses cikarir");
    }
}
class Dog1 extends Animal1{
    public void sound(){
    System.out.println("Kopekler hav hav der");
    }
    public void eat(String s){
        System.out.println("et urunu ise yerler");
    }
}
class Cat1 extends Animal1{
    public void hareket(){
        System.out.println("Kediler dort ayakla yururler");
    }
}