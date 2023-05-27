package Java.Day_63_Rewiew_01;

public class Main {
    public static void main(String[] args) {
        // Person class absract old. icin objesi creat edilemez
      Employee employee=
              new Employee("Ayse",30,'F',"Senior QA",4500,0071,"IT");
        System.out.println("Yasiniz : "+employee.getAge());
        System.out.println("Departmaniniz : "+employee.getDepartmant());



    }
}
