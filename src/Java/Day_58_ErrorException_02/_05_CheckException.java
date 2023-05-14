package Java.Day_58_ErrorException_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _05_CheckException {
    public static void main(String[] args) {
        // Try-Catch zorunlu tutuldugu durumlrda, Check exception olarak ifade edilir
        // Örnegin:Thread.sleep(1000) gibi zorunlu tutulan methodlar

        // Dosya okuma yazma islemlerinde hata olma olma ihtimali yuksek oldugundan
        // hata kontrolu zorunlu tutuluyor

        try {
            FileInputStream file=new FileInputStream("Liste txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Compile error gibi duzeltilmesi zorunlu olan exceptionlar gibi ifade edilebilir
    }
}
