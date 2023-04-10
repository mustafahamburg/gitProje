package Java.Day_28;

import java.util.Random;

public class _9_soru1 {
    public static void main(String[] args) {
        Random random = new Random();
        oddNumber();
    }
    public static int oddNumber() {

        int max = 99;
        int min = 50;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        while (number % 2 == 1) {
            System.out.println("Random number = " + number);
            break;
        }
        return number;
    }
}
