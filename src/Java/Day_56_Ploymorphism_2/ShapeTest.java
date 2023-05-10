package Java.Day_56_Ploymorphism_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();  // parent class olan Shape deki draw

        shape=new Cricle();
        shape.draw();  // Child class olan cricle deki draw

        shape=new Triangle();
        shape.draw();  // ucgen olan sub class daki draw

        shape=new Square();
        shape.draw();  // Burada sub class olan kare deki draw

    }
}
