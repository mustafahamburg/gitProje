package Java.Day_31_StrimgMethodsAndClass;

public class _1_StringConcat {
    public static void main(String[] args) {
        // concat methodu iki stringi birbirine ekler,atama olmaz sadece yazdirir
        String name="Merhaba";
        String lastName="Dunya";
        System.out.println(name.concat(lastName));// MerhabaDunya
        System.out.println(name.concat(" ").concat(lastName));// Merhaba Dunya
        System.out.println(name.concat(name));//MerhabaMerhaba
    }
}
