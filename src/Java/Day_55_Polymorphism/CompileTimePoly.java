package Java.Day_55_Polymorphism;

public class CompileTimePoly {
    public static int Multply(int a,int b){
        return a*b;
    }
    public static int Multply(int a,int b,int c){
        return a*b*c;
    }
    public static double Multply(double a,double b){
        return a*b;
    }
    public static double Multply(double a,int b){
        return a*b;
    }
}
