package Java.Day_46_Static_2;

public class stBlockTest {
    public static void main(String[] args) {
        stBlock st1=new stBlock("Peterson");
        stBlock st2=new stBlock("Philedalphia");
        stBlock st3=new stBlock("Clifton");

        System.out.println(st1.getCity());
        System.out.println(stBlock.country);
    }
}
