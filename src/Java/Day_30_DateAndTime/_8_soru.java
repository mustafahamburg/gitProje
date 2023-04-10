package Java.Day_30_DateAndTime;

public class _8_soru {
    public static void main(String[] args) {
       // 2-Verilen String icerisinde tekrar eden karakterleri
       // tektar sayisi lile birlikte yaziniz.

        String word="abcdbbasacssr";
        char verilenChar='a';
        int counter=0;

        for (int i=0; i<word.length()-1 ; i++) {
            if (word.charAt(i)==verilenChar){
                counter++;
            }
        }
        System.out.println(verilenChar+" karakteri "+word+" icerisinde "+counter+" kez tekrar edilmistir");
    }
}
