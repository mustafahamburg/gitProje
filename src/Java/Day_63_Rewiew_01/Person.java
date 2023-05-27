package Java.Day_63_Rewiew_01;

public abstract class Person {   // buradaki abstract i kullanma sebebi Person un ana sayfa oldnu belirtmek icin
   private String name;
   private int age;
   private char gender;

   public Person(String name,int age,char gender){
      this.setName(name);
      this.setAge(age);
      this.setGender(gender);

   }

   public String getName() {     // Return type ile yazilir(String)
      return name;
   }

   public void setName(String name) { // Set ,parametre ile atanir,return type olmadan yazilir
      if (name.contains(" ")) {        // iki isimli ise arada bosluk var -->Ahmet Emre
         this.name = name.split(" ")[1]; // bolundugunde 0. index ine karsilik gelen -->Emre
      }else
      this.name=name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      if (age>18)
      this.age = age;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      if (gender=='F'||gender=='M')
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", gender=" + gender +
              '}';
   }
}
