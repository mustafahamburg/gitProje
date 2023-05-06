package Java.Day_45_Static_01;

public class Countable {
    int instancaCount; //
    int instancaCount2;
    Countable(){
        instancaCount++;
    }

    public int getInstancaCount() {
       return instancaCount;
    }
}
