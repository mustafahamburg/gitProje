package Java.Day_56_Ploymorphism_2.Example;

public class Calisan extends Kisi{
    private String departman;
    public Calisan(String name, String soyAd, String gorev,String departman) {
        super(name, soyAd, gorev);
        this.departman=departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
