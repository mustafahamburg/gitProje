package Java.Day_39_ConstructorAndOOPintro.Constructor3;

public class Banka {
    String adi;
    int subeSayiasi;
    int kurulusYili;

    public Banka(String adi, int subeSayiasi, int kurulusYili, int balance, String userName) {
        this.adi = adi;
        this.subeSayiasi = subeSayiasi;      //  kisa yolla olusturduk
        this.kurulusYili = kurulusYili;
        this.balance = balance;
        this.userName = userName;
    }

    @Override
    public String toString() {    // kisa yolla yazdirdik
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayiasi=" + subeSayiasi +
                ", kurulusYili=" + kurulusYili +
                ", balance=" + balance +
                ", userName='" + userName + '\'' +
                '}';
    }

    int balance;
    String userName;


}
