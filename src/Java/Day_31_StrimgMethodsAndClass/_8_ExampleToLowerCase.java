package Java.Day_31_StrimgMethodsAndClass;

public class _8_ExampleToLowerCase {
    public static void main(String[] args) {
        String str1="{{}}";
        String str2="Auto";
          // Auto yu parantezlerin icine alalim
        String result=str1.substring(0,2)+str2+str1.substring(2);
        System.out.println("result = " + result);//{{Auto}}
        // toLowerCase -->buyuk karakterleri kucuk yapar
        // toUpperCase-->kucuk karakterleri buyuk yapar

        str2=str2.toLowerCase();
        System.out.println("str2 = " + str2);//auto

        str2=str2.toUpperCase();
        System.out.println("str2 = " + str2);//AUTO


    }
}
