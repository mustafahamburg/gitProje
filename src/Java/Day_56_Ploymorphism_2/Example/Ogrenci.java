package Java.Day_56_Ploymorphism_2.Example;

public class Ogrenci extends Kisi{
    private String sube;

    public Ogrenci(String name, String soyAd, String gorev,String sube) {
        super(name, soyAd, gorev);
        this.sube=sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
