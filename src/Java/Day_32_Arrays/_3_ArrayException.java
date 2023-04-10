package Java.Day_32_Arrays;

public class _3_ArrayException {
    public static void main(String[] args) {
        String[] aile={"Mustafa","Figen","Taha"};
        int[] yaslar;
        yaslar=new int[3];
        yaslar[0]=49;
        yaslar[1]=46;
        yaslar[2]=14;

        double[] boylar=new double[3];
        boylar[2]=1.66;
        boylar[0]=1.73;
        boylar[1]=1.65;

        boolean[] tercih={true,false,true};

        for (int i = 0; i < aile.length; i++)
            System.out.println("aile = " + aile[i] +" ");
        for (int i = 0; i < yaslar.length; i++)
            System.out.println("yaslar = " + yaslar[i]+" ");
        for (int i = 0; i < boylar.length; i++)
            System.out.println("boylar = " + boylar[i]+" ");
        for (int i = 0; i < tercih.length; i++)
            System.out.println("tercih = " + tercih[i]+" ");


    }
}
