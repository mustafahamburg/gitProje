package Java.Day_28;

public class _2_StringPool {
    public static void main(String[] args) {
        String name1="Pamuk";
        String name2=new String("Pamuk");
        String name3="Pamuk";

        if (name1==name3){
            System.out.println(true);
        }
        if (name1.equals(name2)){
            System.out.println(true);
        }
    }
}
