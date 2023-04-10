package Java.Day_31_StrimgMethodsAndClass;

public class _2_Contains {
    public static void main(String[] args) {
        // Bir stringde aranan karakterin oolup olmadigina bakar
        // Boolean doner
        // icermek anlaminda

        String str="Merhaba";
        System.out.println(str.contains("a"));  // true
        System.out.println(str.contains("aba"));//true
        System.out.println(str.contains("g"));  // false
    }
}
