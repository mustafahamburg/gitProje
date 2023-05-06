package Java.Day_52_Abstraction.Example1;

public abstract class Animal {
    protected String name;
    private static int age;

    abstract void eat(); // bu sekilde bir abstract method yazdik
    abstract String ses(); // bu da Abstract ve Abstractlar child class larda Override edilmek zorundadir
    public void toplama(String ad,String soyAd){   // bu CONCRETE  yani soyut olmayan(Abstract olmayan) method
        String fullName=ad+soyAd;
    }
    Animal(){  // Default Constructor

    }
    Animal(int age){
        this.age=age;
    }
    // instance block
    {
        System.out.println("bu bir instance blok");
    }
    static
    {
        System.out.println("Static block yazdik");
    }
    private void sleep(){
        System.out.println("Animals are sleeping");
    }

}
