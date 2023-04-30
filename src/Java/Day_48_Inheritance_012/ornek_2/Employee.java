package Java.Day_48_Inheritance_012.ornek_2;

public class Employee extends Person{
    String jobTitle;
    public void work(){
        System.out.println(name+" is working as "+jobTitle);
    }

    @Override
    public String toString() {
        return "Employee[ jobTitle='" + jobTitle + ", name='" + name + ", age=" + age + ", gender=" + gender + ']';
    }  // modifiye ettik
}
