package Java.Day_53_Interface.Soru1;

public class Vehicle {
    private String model;
    private double engine;

    Vehicle(String model,double engine){ // constructor
        this.model=model;
        this.engine=engine;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getEngine() {
        return engine;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
