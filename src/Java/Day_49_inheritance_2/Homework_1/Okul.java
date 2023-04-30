package Java.Day_49_inheritance_2.Homework_1;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Okul {
    String name;
    int maxOgrenciSayisi;
    public Okul(String name,int maxOgrenciSayisi){
        this.name=name;
        this.maxOgrenciSayisi=maxOgrenciSayisi;
    }
    //Okul oku1=new Okul("MIT",1000);
    ArrayList<Ogrenci>ogrenciler=new ArrayList<>(); // ogrenci listesi
    ArrayList<Calisan>calisanlar=new ArrayList<>(); // calisan listesi
    public void ogrenciKayit(Ogrenci ogr){
       ogrenciler.add(ogr);
      // ogrenciler.add(new Ogrenci("Bilal","300 duncan avenue",oku1,325.25));

    }
    public void caalisanKayit(Calisan calisan){
        calisanlar.add(calisan);
        calisanlar.add(calisan);
    }
    public void calisanListele(){
        for (Calisan calisan:calisanlar){
            System.out.println("calisan = " + calisan);
        }
    }
    public void ogrenciListele(){
        for (Ogrenci ogrenci:ogrenciler){
            System.out.println("ogrenci = " + ogrenci);
        }
    }

    @Override
    public String toString() {
        return "Okul{" +
                "name='" + name + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                '}';
    }

}
