package Java.Day_53_Interface.Soru4;

public interface Animal {
    String food();
    // normalde interface clas inda method body olmadan ve default abstract  olur

    // Bir istisna disinda java8 ile gelistirilen ve iki keyword ile
    // interface method lara body ekleme firsati verdi
    // Dfault yada Static kavramlari eklenerek yazilabilir hale geldi

    default int yas(){ // buradaki default accass modfiry degil
        return 5;
    }
    static int yas1(){
        return 5;
    }
    //Bu stategement iole yazilan methodlar,imlement edilen classlarda override edilme zorunlulugu yoktur
}
