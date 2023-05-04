package Java.Day_53_Interface.Soru3;

public class Test implements IGoster,IYazdir {

    @Override
    public void yaz(String message) {
        System.out.println(message+" message yazdirildi");
    }
    @Override
    public void yaz() { // ayni parametreli ve ayni isimli iki farkli interface sinifindan
        // implement edilen methodlardan sadece biri uygulanir.Cunku ayni kurali tarif ediyor
        System.out.println("yaz");
    }
    @Override
    public void yaz(String message, int times) {
        System.out.println(message+times+" kez yazildi");
    }
    @Override
    public void goster() {
        System.out.println("goster");
    }
}
