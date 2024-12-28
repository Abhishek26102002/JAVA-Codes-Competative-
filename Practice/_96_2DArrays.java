import java.util.*;

public class _96_2DArrays {
    public static void main(String args[]) {
        int[][] matrix0 = new int[3][4]; // 3 m->row and 4 n->colm
        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // accessing Data
        int value = matrix2[1][2]; // value will be 6

        // In Java, a 2D array doesn't have to be a perfect matrix. You can have m of
        // varying lengths.
        int[][] jagged = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[4]; 
        jagged[2] = new int[2];

        // Or with initial values:
        int[][] jagged1 = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8 }
        };

        // scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row_no = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int col_no = scanner.nextInt();

        int[][] matrix3 = new int[row_no][col_no];

        // colm input
       /* 
        for (int colm = 0; colm < col_no; colm++) {
            for (int row = 0; row < row_no; row++) {
                matrix3[row][colm] = scanner.nextInt();
            }
        } 
              */

        // row input
        for (int row = 0; row < row_no; row++) {
            for (int colm = 0; colm < col_no; colm++) {
                matrix3[row][colm] = scanner.nextInt();
            }
        }

        System.out.println("Array contents:");
        for (int i = 0; i < row_no; i++) {
            for (int j = 0; j < col_no; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}