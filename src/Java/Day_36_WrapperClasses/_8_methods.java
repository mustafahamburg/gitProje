package Java.Day_36_WrapperClasses;

public class _8_methods {
    public static void main(String[] args) {
   /// Belirli olmayan sayida gonderilen stringlerin 2.karakterlerinin toplamini yazdiriniz

     String tex=ikinciChar("ahmet","farkindaligin","bedeli","ismet");
        System.out.println("tex = " + tex); //tex = haes

    }
    public static String ikinciChar(String...str){
        String sumChar="";
        for (String s : str){
            sumChar+=s.charAt(1);
        }
        return  sumChar;
    }
}
