package Java.Day_63_Rewiew_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spotify {
    // Bu sirketin IT takimlarindan biri olan scrum takimini kurup yazdiriniz
    public static void main(String[] args) {
        String departmentName="Spotify";
        ProductOwner po= new ProductOwner
                ("Dwight",45,'M',"Middle Product Owner",280000,3201,"IT");

        BusunessAnalayst ba=new BusunessAnalayst
                ("umit",34,'M',"business Analyst",170000,9045,"IT");

        ScrumMaster sm=new ScrumMaster
                ("Emine",32,'F',"Scrum Lead",190000,2311,"IT");

        Tester tester1=new Tester("ismail",25,'M',"S.QA",150000,3214,"IT");
        Tester tester2=new Tester("gulden",22,'F',"Senior.QA",190000,3218,"IT");
        Tester tester3=new Tester("ayse",23,'F',"Senior.QA",180000,3288,"IT");
        Tester tester4=new Tester("bilal",27,'M',"S.QA",170000,3298,"IT");
        Tester tester5=new Tester("ramazan",29,'M',"s.QA",160000,3209,"IT");
        Tester tester6=new Tester("selim",28,'M',"s.QA",170000,3200,"IT");

        Tester testers[]={tester2,tester4,tester3};

        Developers developer1=new Developers("isa",32,'M',"BE",35000,1231,"IT","Java");
        Developers developer2=new Developers("guldenT",34,'F',"FE",35000,1261,"IT","JS");
        Developers developer3=new Developers("gulden",31,'F',"BE",4500,1631,"IT","Python");
        Developers developer4=new Developers("ayse",39,'F',"BE",5500,1201,"IT","C#");
        Developers developer5=new Developers("symbat",30,'F',"FE",4400,1731,"IT","C++");

        Developers[]developers={developer1,developer2,developer3};

        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm,tester6); // bir scrum team olusturduk
        scrumTeam.addDeveloper(developers); // bir developer listesi ekledik
        scrumTeam.addDeveloper(developer4); // bir tek developer objesini scrum team a ekledik
        scrumTeam.addDeveloper(developer5);
        scrumTeam.addTester(testers);// bir tester listesi ekledik
        scrumTeam.addTester(tester1);// bir tek tester objesini scrum team a ekledik
        scrumTeam.addTester(tester5);



        System.out.println("scrumTeam = " + scrumTeam);
    /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write your name : ");
        String name= sc.nextLine();

        System.out.println("Please write your job title : ");
        String jobTitle= sc.nextLine();

        System.out.println("Please write your age : ");
        String age= sc.nextLine();

        System.out.println("Please write your local tax : ");
        double salaryWithTax= sc.nextDouble();

        int taxRange=1;
        if (salaryWithTax*taxRange>0){
            tester1.setSalary(salaryWithTax);
        }else {
            System.out.println("Please write valid tax range");
        }

        Tester test1=new Tester(name,25,'F',jobTitle,salaryWithTax,54125,departmentName);

     */

        System.out.println("-----------------------------------------------");
    /*
        List<Tester>newList=new ArrayList<>();
        for (Tester st: scrumTeam.testers) {
            System.out.println(st.getName());      // burada ters polymorphism ile testers isimlerini yazdirdik
            System.out.println(st.getEmployeeID());
            newList.add(st);
        }
        System.out.println("newList = " + newList);
        System.out.println(newList.size());

     */
        // filtreleme yaptik

        List<Tester>filterListTest =scrumTeam.testers.stream().filter(user->user.getJobTitle().contains("Senior")).toList();
        System.out.println("filterListTest = " + filterListTest);

        // List<Tester>mapListDeveloper=scrumTeam.testers.stream().map(user->new Tester[]);

        int[][]tablo=new int[5][];




    }

}
