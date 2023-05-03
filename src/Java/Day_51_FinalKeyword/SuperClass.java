package Java.Day_51_FinalKeyword;

public class SuperClass {
    int sayi;
    public final void ozelDeger(){
        System.out.println("Özel bir deger atadik");
        double piDeger=3.15;
    }
    public final int toplam(int a,int b){return a+b; }
    public final int toplam(int a){return a; }
    public final int toplam(int a,int b,int c){return a+b+c; }
    public final int toplam(){ int a=5,b=7; return a+b; }
}
// final; overloadind yapilabilir(body degismiyor) yukaridaki gibi
//        overriding yapilamaz(body degisiyor)

// final class olursa inheritance edilemez,
// sub class da degisiklik yapilabilmesi final keyword un
// isleyisina aykiridir