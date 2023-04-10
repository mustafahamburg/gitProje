package Java.Day_30_DateAndTime;

public class _5_StringCharAt {
    public static void main(String[] args) {
        String str="Ramazan";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

        char ilkKarakter=str.charAt(0);
        System.out.println("ilkKarakter = " + ilkKarakter);
        char sonKarakter=str.charAt(str.length()-1);
        System.out.println("sonKarakter = " + sonKarakter);

        if(ilkKarakter==sonKarakter){
            System.out.println("str nin ilk ve son karakterleri esittir");
        }else {
            System.out.println("str nin ilk ve son karakterleri esit degildir");
        }
    }
}
