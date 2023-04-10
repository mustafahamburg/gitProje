package Java.Day_31_StrimgMethodsAndClass;

public class _4_stringIndexOf {
    public static void main(String[] args) {
        // Bir string icerisindeki baskabir stringin inex ini arar
        String cumle="githubheyhey";
        System.out.println(cumle.indexOf("h")); // 3
        System.out.println(cumle.indexOf("ey")); // 7
        System.out.println(cumle.indexOf("ak"));  // -1  aranan yoksa  -1 doner

        System.out.println(cumle.indexOf("h",5));  // 6
                              // 5. karakterden sonraki ilk h nin index ini  bulur

      String liste="java-javascript-c++-Payton-PHP";

      int ilkTireIsaretiIndex=liste.indexOf("-");
        System.out.println("ilkTireIsaretiIndex = " + ilkTireIsaretiIndex);

        int ikinciTireIsaretiIndexi=liste.indexOf("-",ilkTireIsaretiIndex+1);
        System.out.println("ikinciTireIsaretiIndexi = " + ikinciTireIsaretiIndexi);

        int ucuncuTireIsaretiindexi=liste.indexOf(ikinciTireIsaretiIndexi+1);
        System.out.println("ucuncuTireIsaretiindexi = " + ucuncuTireIsaretiindexi);

        // Contain ve indexof ile aratma ve karsilastirma

        // Contains ile :
        if(liste.contains("java")){
            System.out.println("java kelimesi liste stringinde yer almaktadir");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir");
        }
        // indexOf ile:
        if(liste.indexOf("java")>-1){   //  -1   false demektir
            System.out.println("java kelimesi liste stringinde yer almaktadir");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir");
        }

        String fullName="Ahmet Hamdi Tanpinar";
        // istenen cikti: A.H.T.

        int ilkBoslukIndex=fullName.indexOf(" ");
        int ikinciBoslukIndex=fullName.indexOf(" ",ilkBoslukIndex+1);

        System.out.println( "ismin kisaltilmis hali: "+fullName.charAt(0) + "." + fullName.charAt(ilkBoslukIndex+1)+"."
                           + fullName.charAt(ikinciBoslukIndex+1)+".");



    }
}
