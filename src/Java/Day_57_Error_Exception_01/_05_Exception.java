package Java.Day_57_Error_Exception_01;

public class _05_Exception {
    public static void main(String[] args) {
        String str = "Bugun";
        int a = 5;
        int b = 0;
        int c = 0;
        try {
            System.out.println("1.Adim string ile ilgili hata ");
            char ch = str.charAt(4);// Burada hata olusacak
            System.out.println("2.Adim,aritmetik bir hata");
            c = a / b;
            System.out.println("3.Adim,try statement sonu");

        } catch (StringIndexOutOfBoundsException ex) {//burada özel bir isim gerekmiyor ,
            // hatayi tanimlayacak bir isim uygundur
           // System.out.println("4.Adim,Hata olmasi urumunda catch calisti");
           // System.out.println("Hata : String olan nesnenin index degeri asildi");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
           // System.out.println("Hata: Aritmetik islem hatasi");
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }catch (Exception ex){
            //System.out.println("Hata : Genel bir hata olustu");
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        }
    }