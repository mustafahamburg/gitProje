package Java.Day_52_Abstraction.Example3;

public class Dikdortgen extends Sekil{
    double uzunluk;
    double genislik;

    Dikdortgen(double uzunluk,double genislik){ // kullanicidan degerlerin gelmesi obje create ederken
        this.genislik=genislik;
        this.uzunluk=uzunluk;
    }
    @Override
    double alan() {
        return uzunluk*genislik;
    }

    @Override
    double cevre() {
        return 2*(uzunluk+genislik);
    }
}
