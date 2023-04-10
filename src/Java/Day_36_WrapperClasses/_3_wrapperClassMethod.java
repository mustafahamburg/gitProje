package Java.Day_36_WrapperClasses;

public class _3_wrapperClassMethod {
    public static void main(String[] args) {
        boolean c=Character.isAlphabetic('a');
        System.out.println("c = " + c);  // true
        System.out.println(Character.isAlphabetic('1')); // false

        System.out.println(Character.isLetter('f'));//true
        System.out.println(Character.isLetter('2'));// false
        System.out.println(Character.isLetter('&'));// false

        System.out.println(Character.isDigit('4'));//true
        System.out.println(Character.isDigit('g'));// false

        char s=65;
        System.out.println("s = " + s);//s = A

    }
}
