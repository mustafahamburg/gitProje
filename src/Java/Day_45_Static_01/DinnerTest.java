package Java.Day_45_Static_01;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner mom=new Dinner("Ayse","SDT",29,"Expert");
        //int totalSlice=mom.pizzaSlice;
        //System.out.println(mom.pizzaSlice);
        //System.out.println(Dinner.pizzaSlice);
        System.out.println("Toplam pizza dilimi : "+ Dinner.pizzaSlice);// better than before

        Dinner dad=new Dinner("Ali","Tecacher",45,"Math");
        Dinner kid=new Dinner("Veli","Student",15,"None");
        mom.takeASlice();
        dad.takeASlice();
        kid.takeASlice();
        System.out.println("Toplam pizza dilimi method sonrasi : "+ Dinner.pizzaSlice);

        dad.takeASlice(3);
        System.out.println("Toplam pizza dilimi count method sonrasi : "+ Dinner.pizzaSlice);
    }

}
