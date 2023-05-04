package Java.Day_53_Interface.Soru1;

public class TeslaCar extends Vehicle implements IElectric {

    TeslaCar(String model, double engine) { //Bu kisim abstract class la ilgili degil,constructor ile ilgili
        super(model, engine);
    }

    @Override
    public String changeBatary() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
