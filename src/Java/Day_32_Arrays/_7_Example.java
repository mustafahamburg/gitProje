package Java.Day_32_Arrays;

public class _7_Example {
    public static void main(String[] args) {
        String[]futbolcular=new String[11];
        futbolcular[0]="Pele";
        futbolcular[1]="Messi";
        futbolcular[2]="Ronaldo";
        futbolcular[3]="Hami";
        futbolcular[4]="Ali";
        futbolcular[5]="Veli";
        futbolcular[6]="Hasan";
        futbolcular[7]="Hakan";
        futbolcular[8]="Emre";
        futbolcular[9]="Alex";
        futbolcular[10]="Lefter";
        // Verilen dizinin elementlerinin ilk harflerini yazdirin

        System.out.print("Futbolcular isimlerinin ilk harfleri :  ");
        for (int i = 0; i < futbolcular.length ; i++) {
            char ilkHarf=futbolcular[i].charAt(0);
            System.out.print(ilkHarf+".");
        }
    }
}
