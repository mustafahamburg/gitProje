package Java.Day_35_2DArrays;

import java.util.Arrays;

public class _5_examples {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int indexValue=numbers[i][j]=i+j;     // satir ve sutun degerlerinin toplamini buluyoruz
                System.out.println("indexValue = " + indexValue);
            }
        }
        System.out.println(Arrays.deepToString(numbers)); // [[0, 1, 2], [1, 2, 3], [2, 3, 4]]
    }
}
