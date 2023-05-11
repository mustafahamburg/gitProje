package Java.Day_57_Error_Exception_01;

public class _03_TryCatch {
    public static void main(String[] args) {
        System.out.println("HATADAN ONCE!!!");

        try {  // Dene. Hatanin baslama ihtimali olan yerin ustune konur

            System.out.println(1/(1-1)); // Hata

        } // hata oldugu zaman programin kirilmasini engellemek
        catch (Exception e){  // Hatanin bilgisini verir
            System.out.println("burada hata olustu");
        }
        System.out.println("HATADAN SONRA!!!");

    }
}
