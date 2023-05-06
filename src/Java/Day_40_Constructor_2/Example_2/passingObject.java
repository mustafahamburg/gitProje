package Java.Day_40_Constructor_2.Example_2;

public class passingObject {
    public static void main(String[] args) {
     SDET ramazanBey=new SDET("Ramazan Bey",44,'M',"Boing",12000);

     SDET guldenHanim=new SDET("Gülden Hanim",34,'F',"Airbus",13000);
        System.out.println("guldenHanim = " + guldenHanim.salary);
        vergiKesimi(guldenHanim);
        System.out.println("guldenHanim = " + guldenHanim.salary);

     SDET bilalBey;
     // vergiKesimi(bilalBey);// kabul etnez,deger yok
        vergiKesimi(ramazanBey); // sorun yok,deger atanmis
    }
   // passing object
    public static void vergiKesimi(SDET personal){
        personal.salary-=2000;

    }
}
