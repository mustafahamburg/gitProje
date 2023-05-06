package Java.Day_52_Abstraction.Example3;

public class Cember extends Sekil{
    double yariCap;
    Cember(double yariCap){
        this.yariCap=yariCap;
    }
    @Override
    double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yariCap;
    }
}
