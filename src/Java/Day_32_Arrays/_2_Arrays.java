package Java.Day_32_Arrays;

public class _2_Arrays {
    public static void main(String[] args) {

        int[]dizi1={1,34,55,3,665,50};

        int[] dizi2=new int[5];      // bes elementli bir int dizi tanimladik
        String[]dizi3=new String[5]; // bes elementli bir String dizi tanimladik
        boolean[]dizi4=new boolean[5]; // bes elementli bir boolean dizi tanimladik
        double[]dizi5=new double[5]; // bes elementli bir double dizi tanimladik

        dizi3[2]="ismet";
        dizi4[4]=true;

        // Yazdirma:direkt yazdirilamaz,dongu kullanilarak yazdirilir.amcak  tek bir element yazdirilabilir
        // Elementsayisi bir dizinin uzunlugudur,lenght..
        System.out.println(dizi1.length); // 6  dizinin uzunlugudur,yani 6 elementten olusur
        System.out.println("dizi5 = " + dizi5);  // dizi5 = [D@4dd8dc3
        for (int i = 0; i < dizi1.length ; i++) {
            System.out.print(dizi1[i]+" ");  // 1 34 55 3 665 50
        }

        for (int i = 0; i < dizi2.length ; i++)
            System.out.println("dizi2 (int):"+dizi2[i]+" ");
        for (int i = 0; i < dizi3.length ; i++)
            System.out.println("dizi3 (String):"+dizi3[i]+" ");
        for (int i = 0; i < dizi4.length ; i++)
            System.out.println("dizi4 (boolean):"+dizi4[i]+" ");
        for (int i = 0; i < dizi5.length ; i++)
            System.out.println("dizi5 (double):"+dizi5[i]+" ");


    }
}
