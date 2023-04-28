package Java.Day_46_Static_2;

public class Tester {
    String m="m"; // instance veriableyani objeye aiot veriable
    static String deger="d"; // static yani class a ait variable
    static {                         // 1- ilk statis block calisir

        deger+="s";
    }
    //srtatic olmayan block
    {                             // 4-constr. dan önce her zaman calisir
        deger+="o";
    }
    Tester(){  // bir parametresiz constructor olusturduk // 5-mainde
       deger+="t";
       m="m1";
    }
    Tester(String str){  // parametreli cons. olus
        deger+=str;
        m="m2";
    }

    public static void main(String[] args) { // 2- ikinci olark main met. calisir
        Tester test1=new Tester(); // 3-oble olusturulurken constructor calismadan static olmayan block calisir
        test1=new Tester("k");
        System.out.println(deger+test1.m);
    }
}
