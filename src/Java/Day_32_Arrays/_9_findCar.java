package Java.Day_32_Arrays;

public class _9_findCar {
    public static void main(String[] args) {

        String[] cars={"Toyota","Audi","BMW","Reno","Nissan"};
        // Dizinin icinde BMW var mi sorgulayip cevaplayiniz.
        // Ayrica bunu nasil dinamik hale getirebilirsiniz

        boolean flag=false;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].equalsIgnoreCase("audi")){
                flag=true;
            }
        }
        if ((flag)){
            System.out.println("Evet bu marka aracimiz bulunmaktadir");
        }else {
            System.out.println("Bu marka arcimiz bulunmamaktadir");
        }

         //*************************************
        String[] cars1={"Toyota","Audi","BMW","Reno","Nissan"};
       boolean a= dizideArama(cars1,"audi");
        System.out.println("Bu kelime dizinin icinde yer aliyor mu: "+a);
    }
    public static boolean dizideArama(String[] dizi,String arananKelime){
        boolean flag=false;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i].equalsIgnoreCase(arananKelime)){
                flag=true;
            }
        }
        return flag;
    }
}
