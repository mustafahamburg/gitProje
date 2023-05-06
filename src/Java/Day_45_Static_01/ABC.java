package Java.Day_45_Static_01;

public class ABC {
    // Class properties(degiskenler,özelliller)-->Class a ait degiskenler-->instance veriable,fields,class veriable
    static String name;   // statik olabilirler
    int age;

    public static void toplam(){
       // static olamaz,non-static olmak zorunda
     int a=5; // Localveriable
     int b=6;
        System.out.println(a+b);

    }
    public static void m1(){ // staticli method
    }
    public void m2(){  // staticsiz method

    }
    ABC(){  // constructor yazdik,Access Modefiry yazilmadan/ default constructor
    }
}
