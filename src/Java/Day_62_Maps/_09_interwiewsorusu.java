package Java.Day_62_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class _09_interwiewsorusu {
    public static void main(String[] args) {
      // verilwn bir string asagidakigibi tanimlanmistir

      String verilen="baabccdccefeeffaa";
      // beklenen cikti: 4a2b4c2d3e3f hangi harften kac tane var yazilmali...

    frekansBul(verilen);      // Verilenioldugu sirayi bozmadan sonuclari verdi  2b4a4c1d3e3f
    yeniFrekansbul(verilen);  // beklenen sonucu verdi    4a2b4c1d3e3f

        Map<Character,Integer>arananTekrarSayisi=tekrarHarf(verilen);
         for (Map.Entry<Character,Integer>sh:arananTekrarSayisi.entrySet()){
             System.out.print(sh.getValue()+""+sh.getKey());  //4a2b4c1d3e3f
         }


    }
    private static String frekansBul(String verilen){
        String convertString="";
        for (int i = 0; i < verilen.length(); i++) {
           int miktar=0;
            for (int j = 0; j < verilen.length(); j++) {
                if (verilen.charAt(i)==verilen.charAt(j)){
                    miktar++;
                }
            }
            String arananHarf=String.valueOf(verilen.charAt(i));
            if (!convertString.contains(arananHarf)){
                convertString=convertString+miktar+verilen.charAt(i);
            }
        }
        System.out.println("convertString = " + convertString);  //  2b4a4c1d3e3f
        return convertString;
    }
    private static String yeniFrekansbul(String verilen){
        String yeni="";
        int miktar=0;

        String[]liste=verilen.split("");
        Arrays.sort(liste);

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if (liste[i].equals(liste[j])){
                    miktar++;
                }
            }
            if (!yeni.contains(liste[i])){
                yeni=yeni+miktar+liste[i];
            }
            miktar=0;
        }
        System.out.println("yeni = " + yeni);  // 4a2b4c1d3e3f
        return yeni;

    }
    private static Map<Character,Integer>tekrarHarf(String verilen){

        Map<Character,Integer>tekrarSayilari=new TreeMap<>();
        for (char c:verilen.toCharArray()){
            tekrarSayilari.put(c,tekrarSayilari.getOrDefault(c,0)+1);
        }
        return tekrarSayilari;
    }
}
