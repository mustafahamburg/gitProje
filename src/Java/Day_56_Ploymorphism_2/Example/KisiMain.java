package Java.Day_56_Ploymorphism_2.Example;

public class KisiMain {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Bilal","Saglam","Main","euroTech8");
        Calisan calisan=new Calisan("Gulden","Tazeoglu","Automation","QA");

        Kisi.kimlikOlustur(ogrenci);
        Kisi.kimlikOlustur(calisan);

        System.out.println("*******************************");
        // Polymospfic olarak yazdik

        Kisi ogr=new Ogrenci("Ayse","Nur","Automation","Batch_08");

        Kisi calis=new Calisan("Ramazan","Ogretmis","Automation","SDET");

        Kisi.kimlikOlustur(ogr);
        Kisi.kimlikOlustur(calis);
    }
}
