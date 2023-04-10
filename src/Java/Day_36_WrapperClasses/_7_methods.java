package Java.Day_36_WrapperClasses;

public class _7_methods {
    public static void main(String[] args) {
      notlariToplaYaz("Ahmet",50,38,69,74);  //Ahmetnin ders notlarinin ortalamasi:57
      notlariToplaYaz("Mehmet",88,98,76);
      notlariToplaYaz("Ayse",57,89);
      notlariToplaYaz("Nalan",58,69,96,57,49,55,62);

    }
    /* Type belli olan ama ayni type den kac tane parametre olacagi belli degil ise
      uc nokte (...) ile parametre olusturulabilir.
      iki kural:
      1-Bir tane uc noktali parametre olabilir
      2-Parametre en sonda olmalidir
     */
    public static void notlariToplaYaz(String name,int...notlar){
        int sum=0;
        for (int n:notlar){
         sum+=n;
        }
        System.out.println(name+"nin ders notlarinin ortalamasi:"+sum/ notlar.length);
    }
}
