package Java.Day_49_inheritance_2.Homework_1;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Kartal IHL", 1000);
        Okul okul1=new Okul("Yale",2500);

        okul1.ogrenciKayit(new Ogrenci("Ayse","Kartal ilcasi",okul1,520)); // 1.yol
        Ogrenci o1=new Ogrenci("Ismail","Balgat",okul1,425);// 2.yol
        okul1.ogrenciKayit(o1);

        Calisan c1=new Calisan("Gulden","Gungoren",okul,12000);
        Calisan c2=new Calisan("Selim","Studgard",okul,10000);
        okul.caalisanKayit(c1);
        okul.caalisanKayit(c2);

        okul1.ogrenciListele();
        okul.calisanListele();
    }
}
