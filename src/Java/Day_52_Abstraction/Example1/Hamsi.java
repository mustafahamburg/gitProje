package Java.Day_52_Abstraction.Example1;

public class Hamsi extends Papalina {
    // burada normal olan bir class i extend ettik.bu papalina classi Parent ve Grand Parent(Fish ve Animals)
    // abstract class lari extend eden bir class
    // ama override veya baska bir zorunllulk olusturmadi

    // Asagida manuel olarak abstract methodlari override ettik,zorunlu degil
    @Override
    void eat() {
        System.out.println("Hayvanlar beslenerek buyurler");
    }
    @Override
    String ses() {
        return "Sesi duyulmuyor";}
    @Override
    void yasamYeri() {
        System.out.println(" tuzlu suda yasarlar");
    }

    public static void main(String[] args) {
        Hamsi h1=new Hamsi();
        h1.eat();
        h1.yasamYeri();
        System.out.println(h1.ses());
    }
}
