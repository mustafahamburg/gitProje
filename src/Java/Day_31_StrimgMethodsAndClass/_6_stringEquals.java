package Java.Day_31_StrimgMethodsAndClass;

public class _6_stringEquals {
    public static void main(String[] args) {
        String name="Ahmet";
        String name1="Ahmet";
        String name2=new String("Ahmet");
        boolean b=name2.equals(name1);
        boolean b1=name1==name2;

    }
}
