package Java.Day_31_StrimgMethodsAndClass;

public class _3_contains2 {
    public static void main(String[] args) {
        String list="patatoes,tomatoes,eggs,milk,bread,meat,apples";
        System.out.println(list.contains("bread")); // true

        String  email="mstfozturk25hh@gmail.com";
        if (email.contains("@gmail")){
            System.out.println("Mail adresi gmail den alinmistir");
        } else if (email.contains("@yahoo")) {
            System.out.println("Mail adresi yahoo den alinmistir");
        }else if(email.contains("hotmail")){
            System.out.println("Mail adresi hotmail den alinmistir");
        }
    }
}
