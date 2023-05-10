package Java.Day_56_Ploymorphism_2;

public class Animal {
    public void sound(){
        System.out.println("Hayvan ses cikarir");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Kopek hav hav dedi");
    }
    public void eat(String s){

    }
}
class AnimalTest{
    public static void main(String[] args) {
       Animal animal1=new Dog();
       animal1.sound();
     //  animal1.eat(); // bu method cagirilmama sebebi sadece child class a ait kaynaklanir
    }
}