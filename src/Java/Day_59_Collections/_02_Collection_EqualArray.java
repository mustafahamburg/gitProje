package Java.Day_59_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_Collection_EqualArray {
    public static void main(String[] args) {
        //Verilen ikilistenin esit olup olmadigini tartisiniz
        String []sehirler=new String[]{"Munschen","Dortmund","Berlin","Hamburg"};
        String[]kulupler=new String[]{"Bayern Munschen","Borrusia Dortmund","Herta Berlin","FC Hamburg"};

        // 1-Listeler esit mi?
        Arrays.equals(sehirler,kulupler);
        System.out.println(Arrays.equals(sehirler, kulupler)); // false

        // 2- Listenin degerleri diger listede yer aliyor mu?
        String []klupler1=new String[kulupler.length];
        int i=0;
        for (String s :kulupler){
            klupler1[i]=s.split(" ")[1]; // burada yeni olusturulan array in index verilerekdeger atmsi yaptik
                       // Burada bolunen stringin olusan elementler icerisinden index atayarak element aldik
            i++;
        }
        System.out.println(Arrays.toString(klupler1));

        Arrays.equals(sehirler,klupler1);// Expected resultand Actual result verify ediliyor
        System.out.println(Arrays.equals(sehirler,klupler1));

        List<List<String>>listeler=new ArrayList<>();

        ArrayList<String>liste1=new ArrayList<>();
        liste1.add("Ayse");
        liste1.add("Fatma");
        liste1.add("Asya");

        ArrayList<String>liste2=new ArrayList<>();
        liste2.add("Ahmet");
        liste2.add("Mehmet");
        liste2.add("Atik");

        ArrayList<String>liste3=new ArrayList<>();
        liste3.add("John");
        liste3.add("Samuel");
        liste3.add("Chocs");

        listeler.add(liste1);
        listeler.add(liste2);
        listeler.add(liste3);

        System.out.println("listeler: "+listeler.toString());


        Person person1=new Person("Bilal","QA",32);
        Person person2=new Person("Ramazan","SDET",34);
        Person person3=new Person("Ayse","SeniorQA",24);

        List<Person>personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);


        List<Object>list=new ArrayList<>(); // burada object yazdigimizda en genis kume oluyor,hepsini icine aliyor

        list.add(person1); // bu birer obje ise,Class larin babasi olan Object class ina ait oluyor
        list.add(person2);
        list.add(person3);
        list.add(49);
        list.add("mustafa");
        System.out.println("list = " + list);

        List<List<Object>>objelerinListesi=new ArrayList<>();


    }
}
class Person{
    String name;
    String job;
    int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
