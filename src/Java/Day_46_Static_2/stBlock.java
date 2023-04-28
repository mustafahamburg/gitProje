package Java.Day_46_Static_2;

public class stBlock {
    private String city;
    static String country;
    static {    // mainden once calisir
         // Class icerisinde hicbir access modifyr almadan calisir
        System.out.println("static block -1 calisti");
        country="USA";
    }
    stBlock(String a){
    // this.city=a;
        System.out.println("Constructor calisti");
        this.setCity(a);// encapsulation uygun hale geldi
                // Data hiding yapmis olduk
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    static {
        System.out.println("static block -2 calisti");
        country="UK";
    }
}
