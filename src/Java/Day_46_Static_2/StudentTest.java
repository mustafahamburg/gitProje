package Java.Day_46_Static_2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1=new Student();
        student1=new Student("Fatma",23,12341);
        Student student2=new Student();
        Student student=new Student("ismail",25,341);


        System.out.println(student1.toString());
        System.out.println(student1);
        System.out.println(student);
        System.out.println(student2);

        student1.scholl="euroTechSDET";


    }
}
