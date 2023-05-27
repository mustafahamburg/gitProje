package Java.Day_63_Rewiew_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScrumTeam {
    public ProductOwner PO; // burada product owner objesini tanimladik
    public BusunessAnalayst BA;
    public ScrumMaster SM;
    public Tester SDET;

    public ScrumTeam(ProductOwner PO, BusunessAnalayst BA, ScrumMaster SM, Tester SDET) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.SDET = SDET;
    }
    List<Tester> testers=new ArrayList<>(); // burada tester objesi alacak dinamik bir liste creat ettik
    List<Developers> developers=new ArrayList<>();
    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[]tester1){   // tester1--> tester listesini ifade ediyor
        testers.addAll(Arrays.asList(tester1));
        // Ayni method ismi ile overloading olmasi yaninda bir liste eklemesi yaptik
    }
    public void addDeveloper(Developers developer){
        developers.add(developer);
    }
    public void addDeveloper(Developers[] developer1){
        developers.addAll(Arrays.asList(developer1));

    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", SDET=" + SDET +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
