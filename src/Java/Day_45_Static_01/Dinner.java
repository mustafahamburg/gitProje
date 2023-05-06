package Java.Day_45_Static_01;

public class Dinner {
    String name;
    String title;
    int age;
    String job;

    public Dinner(String name, String title, int age, String job) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Dinner{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    static int pizzaSlice=8;

    public void takeASlice(){
        pizzaSlice--;

    }
    public void takeASlice(int count){
        pizzaSlice-=count;
    }
}
