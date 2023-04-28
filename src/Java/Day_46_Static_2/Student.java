package Java.Day_46_Static_2;

public class Student {
    String name;
    int age;
    int idNumber;
    static String scholl="euroTech";

    public Student(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }
    Student(){

    }

    public static void m1(){
        //static int a=8; // static olarak local veriable olmaz!!!
        //m2(); // static bir method icerisine static olmayan bir method yada veriable cagrilamaz
       // age=3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                '}';
    }
}
