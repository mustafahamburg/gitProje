package Java.Day_63_Rewiew_01;

public interface DevTeam {
    //interface deki tum veriable ve method lar default olarak Public Static Abstract Final dir
    public static final boolean hasBackAche=true; // public static final silik yazar cunku default olarak zaten yaziyor
    // Ayrica bu degiskeni class ismi ile cagirabiliriz.Static method icerisinde kullanilmasina uygun olur

    void coding();  // default olarak abstract bir method dur
    void test();

}
