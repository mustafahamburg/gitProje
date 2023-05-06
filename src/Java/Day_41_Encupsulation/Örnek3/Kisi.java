package Java.Day_41_Encupsulation.Örnek3;

public class Kisi {

    private String name;
    private String surname;
    private int yas=24;
  // burada gizli Constructor var ,otomatik olusturuluyor
    public Kisi(String name){
        this.setName(name);
    }
    public int getYas() {  // okudu--Read
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18)
        this.yas = Math.abs(yas); // mutlak deger yaptik
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {    // yazdirmak icin toString() sart,set ederken
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yas=" + yas +
                '}';
    }
}
