package Java.Day_58_ErrorException_02;

public class _04_unCheckedException {
    public static void main(String[] args) {
        // hata olsa bile try zorunlu tutulmuyorsa unchecked ex. denir
        //Runtime exc. islemleri de UncheckedException olarak ifade edilebilir

        int a=2;
        int b=0;
        System.out.println(a/b); // bu UncheckedException dir

    }
}
