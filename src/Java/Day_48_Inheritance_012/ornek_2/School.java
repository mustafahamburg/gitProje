package Java.Day_48_Inheritance_012.ornek_2;

public class School {
    public static void main(String[] args) {
       Student student=new Student();
       student.name="Ayse Hanim";
       student.age=25;
       student.gender='F';
       student.studentID=1234;
       student.eat("Taze Fasulye");
        System.out.println(student.name);

        Employee calisan1=new Employee();
        calisan1.jobTitle="QA";
        calisan1.name="ismail";
        calisan1.gender='M';
        calisan1.age=35;
        calisan1.work();
        System.out.println(calisan1);

       Person person=new Person();

    }
}
