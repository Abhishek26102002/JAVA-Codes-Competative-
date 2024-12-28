//What does find pivot in an array mean?
// *An element in an array is a pivot element if the sum of all the elements in the list to its left is equal to the sum of all the elements to its right. EX : {1,2,3,7,6} here 7 is pivot element as 1+2+3 = 6 * Coming to the question, I will be sharing my code for this question.

import java.util.*;

public class _60_pivotElement {
    public static int pivot(int[] arr) {
        int totalSum = 0;
        for (int x = 0; x < arr.length; x++) {
            totalSum += arr[x];
        }
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };

        int x = pivot(arr);
        System.out.println("Pivot Index "+x+" ele is "+arr[x]);

    }
}