package Java.Day_31_StrimgMethodsAndClass;

public class _5_StringReplace {
    public static void main(String[] args) {
        // Replace bir string icerisinde yer alan kelimeyi yeniden yazmamizi sagler ,degistirme ...
        String str="London is capital of Germany";
        System.out.println("str = " + str);// ilk olarak degisecek string girilir

        str=str.replace("London","Berlin");
        System.out.println("str = " + str);

        str=str.replace("Berlin","Ankara").replace("Germany","Turkey");
        System.out.println("str = " + str); // Ankara is capital of Turkey

        str=str.replace("Ankara",""); // space "" kullanarak silme yapabiliriz
        System.out.println("str = " + str);//is capital of Turkey

        str=str.replaceAll("[A-Z]","*");
        System.out.println("str = " + str);// is capital of *urkey
    }
}
