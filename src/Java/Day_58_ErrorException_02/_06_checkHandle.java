package Java.Day_58_ErrorException_02;

import java.util.Scanner;

public class _06_checkHandle {
    public static void main(String[] args) {
        // kullanıcıdan hava sıcaklığını isteyiniz.
        // ayrı bir metodda bunun kontrolünü yaparak hava
        // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
        // mainden çağırarak hatayı kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Hava sicakligi= ");
        int sicaklik= oku.nextInt();
        /*
        try {
            sicaklikKontrol(sicaklik);
        }catch (Exception e){
            e.printStackTrace();
        }
        */
        //Asagida Method icerisinde throw ile hatayi handle ettik
         sicaklikKontrol(sicaklik);

    }
    public static void sicaklikKontrol(int sicaklik){
        try {
            if (sicaklik <= 10) {
                throw new Exception("Hava soguk disari cikmayin");
            } else {
                throw new Exception("Disarida basketbol oynayabilirsiniz");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
