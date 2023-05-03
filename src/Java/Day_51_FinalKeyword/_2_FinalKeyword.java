package Java.Day_51_FinalKeyword;

public class _2_FinalKeyword {
    final String name="BILAL";
    //non-static statement(body)
    {
        final String name="GULDEN"; // Bir local final variable tanimladik
    }
    static {
        final String name="AYSE";
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Main calisti");
    }
    public void test1(){
        final String name="Symbat";
    }
}
