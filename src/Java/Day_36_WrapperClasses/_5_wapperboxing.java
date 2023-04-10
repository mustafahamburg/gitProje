package Java.Day_36_WrapperClasses;

public class _5_wapperboxing {
    public static void main(String[] args) {
        Integer a=5;
        int b=6;
        System.out.println("b = " + b);   //6

        a=7; // yeniden atanan deger yine wrapper class objesi
        a=b; // burada ise wrapper objesini primitive olan int deerine esitledik
             // Wrapper to primetive --->unboxing

        int num=5;
        Integer num2=num;// autoboxing yapildi
        System.out.println("num2 = " + num2);  //5

        int number1=new Integer(123);      // unboxing;kucuge buyugu esitledik
        Integer number2=new Integer(123);  // no boxing
        int number3=number2;                     // unboxing

    }
}
