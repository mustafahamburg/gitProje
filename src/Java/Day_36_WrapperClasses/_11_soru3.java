package Java.Day_36_WrapperClasses;

import com.sun.jdi.request.StepRequest;

public class _11_soru3 {
    public static void main(String[] args) {
        //Sıra sayısına göre (0'dan başlayarak) her diziden bir karakter seçerek(or:ikincikelimenin 2. karakteri...)
        // aşağıdaki ifadedeki gizli anahtarı bulan bir yöntem yazın.
        //findSecretKey("Bazen", "kederler", "sessiz", "degisiklik", "yapmk",
        //"kismetsizliginde", "ıslanmak", "istemezsler");

        String anahtarKelime=findSecretKey("Bazen", "kederler", "sessiz", "degisiklik", "yapmk",
                "kismetsizliginde", "ıslanmak", "istemezsler");
        System.out.println("anahtarKelime = " + anahtarKelime); // anahtarKelime = Besiktas
    }

    public static String findSecretKey(String...str){
        String keyWord="";
        for (int i = 0; i < str.length; i++) {
          keyWord+=str[i].charAt(i);  // str deki i ninci elemanin i ninci karakterini aliyoruz

        }
        return keyWord;
    }
}
