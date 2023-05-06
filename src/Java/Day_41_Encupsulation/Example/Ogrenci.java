package Java.Day_41_Encupsulation.Example;

public class Ogrenci {

  private int okulNo;
  private String ad;
  private String soyAd;
  private int yas;
  private static int ID=1;

    public Ogrenci(String ad, String soyAd, int yas) { // once constructor olusturduk,
                                                       // sonra set ettik,boylece capsule ettik
         this.setAd(ad);        //this.ad = ad;
         this.setSoyAd(soyAd);  //this.soyAd = soyAd;
         this.setYas(yas);      //this.yas = yas;
         this.getOkulNo();     // bu sekilde de kullanabiliriz
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>15){
            System.out.println("15 yasindan buyuk olamaz");
        }else {
           this.yas=Math.abs(yas);
        }

    }
}
