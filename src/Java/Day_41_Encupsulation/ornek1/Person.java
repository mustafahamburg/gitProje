package Java.Day_41_Encupsulation.ornek1;

public class Person {
    private String name;
    private int age;
    public char gender;
    // SET-->UPTADE etme veuzerine yazma islemi yapilabilir
    // SET-->WRITE

    public void setGender(char gender){
        this.gender=gender;
    }

    public void setName(String name){
        char[] crr=new char[name.length()];
        String[] str=name.split("");

        this.name=name;
    }
    public void setAge(int age){
        this.age=Math.abs(age); // mutlak degerli bir degisken tanimladik,eksi de girilse egal
    }
    // Get ile sadece cagirmayi ve okumayi saglamis olureuz
    // GET--> READ

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
