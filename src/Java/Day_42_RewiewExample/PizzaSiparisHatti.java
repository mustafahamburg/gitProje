package Java.Day_42_RewiewExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PizzaSiparisHatti {
    /* Bir pizza siparis hgatti yapilmak isteniyor
       Kullaniciya pizza icin 1-Small 2-Medium 3-Large 4-Isleme al
       seceneklerini bir menu seklinde vererek ,verdigo pizzalari bir Arraylist e atiniz
       4 u sectiginde her pizzadan kacar tane siparis verildigini bir methodda yazdiriniz
       Cikis islemi olsun
     */
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();
        int secim;

        do {
            menu();
            System.out.println("Secim yapiniz");
            secim=oku.nextInt();
            islemYap(secim,siparisler);

        }while (secim<5);

    }
    public static void islemYap(int secim,ArrayList<Pizza>siparisler){
        LocalDateTime time= LocalDateTime.now();
        if(secim==4){
            islemeAl(siparisler);
            System.out.println(time);
        }else {
            siparisAl(secim, siparisler);
        }

    }
    public static void islemeAl(ArrayList<Pizza>siparisler){
        int mikSmall=0;
        int mikMidium=0;
        int mikLarge=0;
        for (Pizza p : siparisler) {   // foreach
            switch (p.buyukluk){
                case SMALL : mikSmall +=p.miktar;  break;
                case MIDIUM: mikMidium +=p.miktar; break;
                case LARGE : mikLarge +=p.miktar;  break;
            }
            
        }
        System.out.println("Small pizza " + mikSmall+" adet");
        System.out.println("Midium pizza "+ mikMidium+" adet");
        System.out.println("Large pizza " + mikLarge+" adet");

        siparisler.clear(); // bir Array listini temizler
    }
    public static void siparisAl(int secim,ArrayList<Pizza>siparisler){
        Scanner sc=new Scanner(System.in);
        if(secim<=4) {
            System.out.print("Miktar= ");
            int miktar = sc.nextInt();

            Pizza siparisEdilenPizza = null;
            switch (secim) {
                case 1:
                    siparisEdilenPizza = new Pizza(miktar, PizzaSize.SMALL);
                    break;
                case 2:
                    siparisEdilenPizza = new Pizza(miktar, PizzaSize.MIDIUM);
                    break;
                case 3:
                    siparisEdilenPizza = new Pizza(miktar, PizzaSize.LARGE);
                    break;

            }
            siparisler.add(siparisEdilenPizza);
        }
    }

   public static void menu(){
       System.out.println("*****PIZZA MENU*****");
       System.out.println(" 1- SMALL");
       System.out.println(" 2- MIDIUM");
       System.out.println(" 3- LARGE");
       System.out.println(" 4- ISLEME AL");
       System.out.println(" 5- CIKIS");

   }
}
