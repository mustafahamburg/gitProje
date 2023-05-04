package Java.Day_53_Interface.Soru2;

public class Cember implements ISekil{
    @Override
    public double cevresi(int... dizi) {
        return Math.PI*2*dizi[0]; // math class indan pi alarak dizinin ilk degerini
                                  // yari cap olarak belirlemis olduk
    }
    @Override
    public double alan(int... dizi) {
        return Math.PI*dizi[0]*dizi[0]; // pi*r*r
    }
}
