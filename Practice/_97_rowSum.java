import java.util.*;

public class _97_rowSum {
    public static void printSum(int[][] arr, int row, int col) {
        /*
         * System.out.println("Printint col sum :\n");
         * for (int i = 0; i < row; i++) {
         * int sum = 0;
         * for (int j = 0; j < col; j++) {
         * sum += arr[j][i];
         * }
         * System.out.print(sum+" ");
         * }
         */

        System.out.println("Printint row sum :");
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

    }

    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printSum(arr, 3, 3);

    }
}