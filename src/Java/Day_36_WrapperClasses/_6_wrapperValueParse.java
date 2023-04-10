package Java.Day_36_WrapperClasses;

public class _6_wrapperValueParse {
    public static void main(String[] args) {
        String strNumber="2023";
        System.out.println("strNumber = " + strNumber);// 2023

        int number=Integer.parseInt(strNumber);
        System.out.println("number = " + number);// 2023

        int number1=Integer.valueOf(strNumber);
        System.out.println("number1 = " + number1); // 2023

        strNumber+=5;
        System.out.println("String degiskene strNumber eklendikten sonra = " + strNumber); // 20235
        number+=5;
        System.out.println("ParseInt den sonra = " + number);// 2028
        number1+=5;
        System.out.println("ValueOf dan sonra = " + number1);// 2028

    }
}
