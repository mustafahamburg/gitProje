package Java.Day_61_Collections_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_Lambda {
    public static void main(String[] args) {
        List<String> ulkeler = new ArrayList<>() {{
            ;
            add("Germany");
            add("England");
            add("Finland");
            add("USA");
            add("Turkey");

        }};
        ulkeler.get(2).length(); // listenin get ile lementini index vererek aldik ve uzunluguna baktik
        Iterator asIteratoList= ulkeler.iterator();
        while (asIteratoList.hasNext()) {  // hasNext()-> bir sonraki varsa islemi yaptirir
            System.out.println("asIteratoList.next() = " + asIteratoList.next());

        }

    }


}
