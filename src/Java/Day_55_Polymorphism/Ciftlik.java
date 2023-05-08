package Java.Day_55_Polymorphism;

public class Ciftlik {

    public static void main(String[] args) {
      Animal1 animal1=new Animal1("Ali");
      animal1.privateMethod();

    // buradaki methodlar object class indan gelen bilgiler,class larin babasi rolundedir
        System.out.println(animal1.getClass());
        System.out.println(animal1.getClass().getName());
        System.out.println(animal1.getClass().getSimpleName());
    }
}
class Animal1{
    // Private methodlar sadece bulunduklari class da kull.
    private void yas(){
        System.out.println("Hayvanlarin yasi");
    }
    private void tuketim(){
        System.out.println("Hayvanlar yasmak icin beslenirler");
    }
    public void privateMethod(){
        yas();
        tuketim();
    }
    private String name;

    public Animal1(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "name='" + name + '\'' +
                '}';
    }
}
