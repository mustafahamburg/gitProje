package Java.Day_30_DateAndTime;

public class _6_StringExample {
    public static void main(String[] args) {
        /* Bir program yaziniz:2-Verilen String icerisinde tekrar eden karakterleri
          tektar sayisi lile birlikte yaziniz.
          1-verilenkarakterin kac kez tekrar ettigini bulalim(asagidaki)

         */
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
