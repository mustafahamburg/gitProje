package Java.Day_55_Polymorphism;

import java.util.concurrent.Callable;

public class Animal {
    public void sound(){
        System.out.println("Animals make a sound");
    }
}
class Dog extends Animal{
    public void sound (){
        System.out.println("Dog says:Bow bow make");
    }
}
class Cat extends Animal{
    public void sound (){
        System.out.println("Cat says:meow meow make");
    }
}
class Duck extends Animal{
    public void sound (){
        System.out.println("Duck says:quack quack make");
    }
}
class PolymorphismExample{
    public static void main(String[] args) {
        // Object creation non-polymorphism way

        Animal a=new Animal();
        a.sound();
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
        Duck du=new Duck();
        du.sound();

        System.out.println("----------------------------------");

        // Object creation with polymorphism way
        Animal animal=new Animal();
        animal.sound();
        Animal dog=new Dog();
        dog.sound();
        Animal cat=new Cat();
        cat.sound();
        Animal duck=new Duck();
        duck.sound();

        System.out.println("----------------------------------");

        animal=new Dog();
        animal.sound();

        animal=new Cat();
        animal.sound();

        animal=new Duck();
        animal.sound();




    }
}