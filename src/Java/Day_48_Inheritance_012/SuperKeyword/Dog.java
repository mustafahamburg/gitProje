package Java.Day_48_Inheritance_012.SuperKeyword;

public class Dog extends Animal {
    int eyes;
    int legs;
    int teeth;
    int nectSpot;
    // Constructorli bir class asagida old. gibi constructor create edilerek extend edilebilir
    // Bu class objesi icin bir constructor olusturduk.Yani 9 fields lazim bir obje icin
    // Bu super class in extends edilme islemi icin bir constructor cagirildi


    // ya boyle
    public Dog(String name, int brain, int body, int size, int weight) { // Kisa yolla yapildi. bu super class in fielsleri
        super(name, brain, body, size, weight); // Default degerlercagirildi  super class tan gelenler
    }

   // ya da boyle yapilir
     public Dog(int eyes,int legs,int teeth,int nectSpot){
        super("Lessi",1,1,8,20); // deger atanarak cagirildi
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.nectSpot=nectSpot;
     }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", brain=" + getBrain() +
                ", body=" + getBody() +
                ", size=" + getSize() +
                ", weight=" + getWeight() +
                '}'+
                "Dog{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                ", teeth=" + teeth +
                ", nectSpot=" + nectSpot +
                '}';
    }
    // Dog(int eyes,int legs,int teeth,int nectSpot){
    //    super("Lessi",1,1,8,20);// extend edilen bir class tan obje creat etmek gibi
    // constructor SUPER kullandik
   }


