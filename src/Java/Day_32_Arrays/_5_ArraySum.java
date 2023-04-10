package Java.Day_32_Arrays;

public class _5_ArraySum {
    public static void main(String[] args) {
        int[] sayilar=new int[6];
        sayilar[0]=3;
        sayilar[1]=8;
        sayilar[2]=24;
        sayilar[3]=34;
        sayilar[4]=21;
        sayilar[5]=13;

        int sum=sayilar[0]+sayilar[1]+sayilar[2]+sayilar[4];
        System.out.println("Dizideki dort sayinin ortalamasi: "+sum/4);
    }
}
