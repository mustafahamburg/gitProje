package Java.Day_32_Arrays;

public class _8_forEach {
    public static void main(String[] args) {
        String[] names={"name1","name2","name3","name4","name5","name6"};

        double[]prices=new double[4];
        prices[0]=105;
        prices[1]=10.5;
        prices[2]=125.55;
        prices[3]=15.99;
        // for ile...
        for (int i = 0; i <names.length ; i++)
            System.out.println("name = " + names[i]);

        // foreach ile:genellikle yazdirma da pratik...
        for (String str :names) {
            System.out.println("str = " + str);
        }
        for (double prc:prices) {
            System.out.println("prc = " + prc);
        }
        // verilen fiyatlara %20 indirim uygulayin
        for (double ind:prices) {
            System.out.println("%20 indirimli fiyat: "+ind*0.8);
        }

    }
}
