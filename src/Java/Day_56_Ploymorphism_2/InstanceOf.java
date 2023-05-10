package Java.Day_56_Ploymorphism_2;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape=new Cricle();
        if (shape instanceof Square){ // bu sekil Square class ina mi ait?
            System.out.println("Shabe belong to Square Class ");
        }else if (shape instanceof Cricle){
            System.out.println("Shape belong to Cricle Class"); // bu sekil daire sinifina aittir
        }else if (shape instanceof Triangle){
            System.out.println("Shape belong to Triangle class");
        }
    }
}
