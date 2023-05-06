package Java.Day_41_Encupsulation.ornek1;

import Java.Day_41_Encupsulation.ornek1.Person;

public class PersonTest {
    public static void main(String[] args) {

       Person p1=new Person();
       p1.setName("Albert");
       p1.setAge(25);
       p1.setGender('F');
        System.out.println("p1 = " + p1);


       Person p2=new Person();  // busekilde mantiksiz girisler olabilir,bunun engellenmesi gerekir
       p2.setName("Ayse98");
       p2.setAge(-857);
       p2.setGender('M');
        System.out.println("p2 = " + p2);


    }
}
