package Java.Day_36_WrapperClasses;

public class _2_wrapperClassMethod {
    public static void main(String[] args) {
        // bir class icindeki method veya field leri kullanabilmek icin "class." yapip goruruz
        int maxValue=Integer.SIZE;
        System.out.println("maxValue = " + maxValue);//maxValue = 32

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        double d=Double.MAX_VALUE;
        double d1=Double.MIN_VALUE;
        System.out.println("d1 = " + d1);//d1 = 4.9E-324
        System.out.println("d = " + d);//d = 1.7976931348623157E308

        byte b=Byte.MAX_VALUE;
        System.out.println("b = " + b);//b = 127
        System.out.println(Byte.MIN_VALUE);//-128



    }
}
