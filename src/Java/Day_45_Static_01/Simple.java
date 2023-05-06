package Java.Day_45_Static_01;

public class Simple {
    int a; // olusturulacak nesneye (objeye ) ait degiskendir
    static int b; // Clas a ait degiskendir
    void arttir(){
        a++;
        b++;
    }
    public static void main(String[]args){
        Simple ornek1=new Simple();
        ornek1.a=5;
        ornek1.a=15;
        System.out.println("ornek1.a = " + ornek1.a);
        System.out.println("ornek1.b = " + ornek1.b);

        Simple ornek2=new Simple();
        ornek2.b=12;
        ornek1.b=11;
        ornek2.b=13;
        Simple.b=44;

        System.out.println("ornek2.a = " + ornek2.b);
        System.out.println("ornek2.b = " + ornek2.a);

        ornek1.arttir();
        ornek2.arttir();

        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("ornek1.a = " + ornek1.a);
        System.out.println("ornek2.b = " + ornek2.b);
        System.out.println("ornek1.b = " + ornek1.b);
    }
}
