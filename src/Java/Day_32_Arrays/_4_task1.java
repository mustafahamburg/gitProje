package Java.Day_32_Arrays;

import java.util.Scanner;

public class _4_task1 {
    public static void main(String[] args) {

        String[] aylar=new String[12];
        aylar[0]="Ocak";
        aylar[1]="Subat";
        aylar[2]="Mart";
        aylar[3]="Nisan";
        aylar[4]="Mayis";
        aylar[5]="Haziran";
        aylar[6]="Temmuz";
        aylar[7]="Agustos";
        aylar[8]="Eylul";
        aylar[9]="Ekim";
        aylar[10]="Kasim";
        aylar[11]="Aralik";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen istediginiz ayin indexini giriniz");
       int gunIndex=scan.nextInt();
        System.out.println("Girdiginiz index ile tanimlanan gun: "+aylar[gunIndex]);


    }
}
