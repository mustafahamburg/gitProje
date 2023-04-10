package Java.Day_31_StrimgMethodsAndClass;

public class _7_stringSubstring {
    public static void main(String[] args) {
        // Sub=Alt demek .Substring methodu bir stringi kesmek icin kull.
        String str="java String Manipulation is fun!";
        str=str.substring(5);
        System.out.println("str = " + str);  // String Manipulation is fun!

        str=str.substring(20);
        System.out.println("str = " + str);  // is fun!

        str=str.substring(0,2);  // ilk dahil,son dahil degil
        System.out.println("str = " + str); // is

        String str1="Hava gittikce soguyor";
        // beklenen cikti: ava git
        str1=str1.substring(1,8);
        System.out.println("str1 = " + str1);//ava git

    }
}
