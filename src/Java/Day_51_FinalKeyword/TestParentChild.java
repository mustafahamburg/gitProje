package Java.Day_51_FinalKeyword;

public class TestParentChild {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.azalis();
        System.out.println(p1.age);
        System.out.println("p1.name = " + p1.name);
        p1.azalis();
        System.out.println(p1.exchanceRate);

        Child c1=new Child();
        System.out.println(c1.age);
        c1.azalis();
        System.out.println(c1.exchanceRate);
        System.out.println(c1.name);

    }
}
