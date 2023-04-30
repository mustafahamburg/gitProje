package Java.Day_50_AccessModifiry.AccessModifires1;

public class A1 {
   private  int sayi=5;
   private String name="ismet";

    public A1() {
        System.out.println("Default constructor calisti");
    }

     A1(int sayi) {
        this.setSayi(sayi);
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        if(sayi>=0)
         this.sayi = sayi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0)
          this.name = name;
    }

    public void test(){
       sayi=23;
       name="bilal";

   }

   // public static void main(String[] args) {
   //     sayi=12;

   // }
}
