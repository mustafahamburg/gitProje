package Java.Day_32_Arrays;

public class _6_Example {
    public static void main(String[] args) {
        String tex="Kararmis ruhlarin rencide edici bakislari arasinda hergun affederek yuruyorum; Yazar:Ismet Gunes";
        // Bucumlede gecen kelimeleri bir array olusturup element olarak atayiniz
        // Olusan elementlerin icerisinden yazarin isminin kisaltilmis halini yazdiriniz

        String[] dizi=new String[12];
        dizi[0]=tex.substring(0,8);
        dizi[1]=tex.substring(9,17);
        dizi[2]=tex.substring(18,25);
        dizi[3]=tex.substring(26,31);
        dizi[4]=tex.substring(32,41);
        dizi[5]=tex.substring(42,50);
        dizi[6]=tex.substring(50,57);
        dizi[7]=tex.substring(58,67);
        dizi[8]=tex.substring(68,77);
        dizi[9]=tex.substring(78,84);
        dizi[10]=tex.substring(85,90);
        dizi[11]=tex.substring(91,96);


        for (int i = 0; i < dizi.length; i++)
            System.out.println("dizi = " + dizi[i]+" ");

        System.out.println("**************************************");

        System.out.println( "Yazarin isminin kisaltilmis hali: "+dizi[10].charAt(0) + "." + dizi[11].charAt(0)+".");
    }
}
