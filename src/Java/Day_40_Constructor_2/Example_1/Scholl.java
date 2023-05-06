package Java.Day_40_Constructor_2.Example_1;

public class Scholl {
    public static void main(String[] args) {

        Student ogr3=Student.createStudent();    // ikinci bir yontemle ogrenci creat ettik
        System.out.println("Method cagirilarak ogrenci kaydi   "+ogr3.ogrName);

        Student ogr4=new Student();
        System.out.println("Constructor ile ogrenci kaydi   "+ogr4.ogrName);

        Student ogr5=new Student(123,"Ahmet","Bayram",5,true);
        System.out.println("Parametreli condstructor cagirildi:  "+ ogr5.ogrName);// null

        // Bazi parametreler belli degilse nasil kaydetme yapariz?
        Student ogr6=new Student(123,"Ahmet","Bayram",5);
        System.out.println(ogr6.ogrLevel);

        Student ogr7=new Student(123,"Ahmet","Bayram");
        System.out.println(ogr7.ogrName);

        Student ogr8=new Student(123);
        System.out.println(ogr8.ogrNumber);
    }


}
