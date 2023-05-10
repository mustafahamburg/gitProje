package Java.Day_56_Ploymorphism_2;

import java.util.ArrayList;
import java.util.List;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shape=new Shape[3]; // Bir sekil objelerini icerecek array olusturduk
        shape[0]=new Cricle(); // Sekil dizisinin ilk elementine daire objesini create ettik
        shape[1]=new Triangle();
        shape[2]=new Square();

        shape[0].draw(); // burada sekil dizisinin ilk elementinin draw methodunu cagirdik

        for (Shape sh:shape){  // for each ile diziyi yazdirmak istedik
            System.out.println(sh.getClass()); // class information getirir(object class indan)
            System.out.println(sh.getClass().getName());
            System.out.println(sh.getClass().getSimpleName());
        }
        System.out.println("**********************************");
        // List ile Arraylist arasinda Polymorphism var
        List<Shape>shapeList=new ArrayList<>(); // Bu list adindaki interface class inin
                                                // child class larindan Arraylist kullandik
        shapeList.add(new Cricle());
        shapeList.add(new Triangle());
        shapeList.add(new Square());
        for (int i = 0; i < shape.length ; i++) {
            System.out.println(shapeList.get(i).getClass().getSimpleName());
        }
    }
}
