package Java.Day_52_Abstraction.Example1;

public class Papalina extends Fish {

    @Override
    void eat() {
    }
    @Override
    String ses() {
        return "duyulmayan bir ses cikariyor";}
    @Override
    void yasamYeri() {
        System.out.println("Tatli ve tuzlu suda yasarlar");
    }

    public static void main(String[] args) {
        Papalina balik1=new Papalina();
        balik1.name="Buyuk Papalina";
        balik1.toplama("Buyuk","Papalina"); // Abstract  olmayan method objeyi tanimmliyor
                                  // Burada objeyi modify etmede kullandik
        balik1.ses(); // burada abstract methodu  herhangi bir sey yazmadan cagirdik
        System.out.println(balik1.ses()); // return type i old icin yazdirabiliyoruz(String)
        //System.out.println(balik1.yasamYeri());// void ild icin yazdiramiyoruz
    }
}
