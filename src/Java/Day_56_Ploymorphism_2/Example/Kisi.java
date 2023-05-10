package Java.Day_56_Ploymorphism_2.Example;

public class Kisi {
     private String name;
     private String soyAd;
     private String gorev;

    public Kisi(String name, String soyAd, String gorev) {
        this.name = name;
        this.soyAd = soyAd;
        this.gorev = gorev;
    }
    // Methdun parametresinde Kisi data type si olan Kisi class indan bir obje olusturduk
    public static void kimlikOlustur(Kisi kisi){ // Buradaki parametre direkt bir obje creat eder
                                                 // (Kisi kisi) parametre-->Kisi kisi=new Kisi();
        System.out.println("kisi.name= "+kisi.name);
        System.out.println("kisi.soyAd = " + kisi.soyAd);
        System.out.println("kisi.gorev = " + kisi.gorev);

        // gelen kisi ogrenci ise
        if (kisi instanceof Ogrenci){
            System.out.println("Sube= "+((Ogrenci) kisi).getSube()); // Cast yapilarak kisi subesi ogrenci
                                                                 // subesine donusturuldu
        }
        if (kisi instanceof Calisan){
            System.out.println("Departman= "+((Calisan) kisi).getDepartman());
        }
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
