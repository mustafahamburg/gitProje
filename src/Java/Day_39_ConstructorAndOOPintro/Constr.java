package Java.Day_39_ConstructorAndOOPintro;

public class Constr {

    public Constr( ){
        hesapAktifMi=true;
        checkBalance=120;
        bankaAdi="tninBankasi";
}

    public Constr(String userName,int credit) {
        userName = hesapSahibi;
        credit = checkBalance;
    }
    public Constr(int a,int b,String str,boolean b1) { // daha fazla paramettreli(overloading olma durumunda)
    }

        // THIS-> belirleyip deger atama isini constr. da yapar
    public Constr(String bankaAdi,String paraBirimi,int hesapNo){
        this.bankaAdi=bankaAdi;   // this.bankaAdi-> instance veriable    bankaAdi;->Local veriable yani parametre
        this.hesapNo=hesapNo;
        this.paraBirimi=paraBirimi;
    }


    String hesapSahibi;
    boolean hesapAktifMi;
    String bankaAdi;
    int checkBalance;
    String paraBirimi;
    String subeAdres;

    int hesapNo;
    int bakiye;
    double karOrani;
    public void paraYatir(){

    }
    public void paraCek(){

    }
}