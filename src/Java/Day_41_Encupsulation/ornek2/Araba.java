package Java.Day_41_Encupsulation.ornek2;

public class Araba {
    private String renk;
    private String model;
    private int motor;
    private double fiyat;

    public Araba(String renk, String model, int motor, double fiyat) {
        this.renk = renk;
        this.model = model;
        this.motor = motor;
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        if (motor>1300)
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", fiyat=" + fiyat +
                '}';
    }
}
