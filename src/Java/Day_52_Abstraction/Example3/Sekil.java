package Java.Day_52_Abstraction.Example3;

public abstract class Sekil {
     static int uzunluk; //--> Static olan class variable toString methodunda Generate ile cagrilamaz,manuel eklenebilr

    private String name;
    Sekil(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    abstract double alan();
    abstract double cevre();
    public void ciz(){
        System.out.println(name+" sekil cizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan hesaplama='" + Math.round(alan()) + '\'' + // Burada Abstrac olan bir methodun sonucunu toString e ekledik
                "cevre hesaplama='" + Math.round(cevre()) + '\'' + // Burada Abstrac olan bir methodun sonucunu toString e ekledik
                "uzunluk='" + uzunluk + '\'' +  // static olan bir variable yi  toString e ekledik
                '}';
    }
}
