import java.util.*;
import java.util.Arrays;

public class _03_Arrays {
    public static void main(String[] args) {

        int[] arr = { 6, 5, 4, 32, 2, 1 };
        int[] arr2 = { 1, 2, 3, 4, 5, 5, 6 };
        int[][] Array5 = { { 1, 2 }, { 1, 2 } };
        int[][] Array6 = { { 1, 2 }, { 1, 2 } };

        Arrays.sort(arr);

        Arrays.binarySearch(arr, 0, 4, 5);// can also ADD FROM TO
        Arrays.binarySearch(arr, 5);

        Arrays.fill(arr, 12); // fill whole, arr with val of 12

        boolean[] prime = new boolean[arr.length]; // making every ele of array to be true
        Arrays.fill(prime, true);

        // for each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Arrays.toString(arr2); // print array** ex- [6, 5, 4, 32, 2, 1]

        Arrays.equals(arr, arr2); // compare two arrays
        Arrays.compare(arr, arr2); // compare two arrays  output 0 or 1

        int[] arr3 = Arrays.copyOf(arr, 3); // creat new array of newlength

        int[] arr4 = Arrays.copyOfRange(arr, 1, 3);

        Arrays.deepEquals(Array5, Array6);// comapre two 2D array

        Arrays.asList(arr2);// convert Array to List<Type> list1= Arrays.asList(arr2);

        int[] arr7 = new int[5];
        Arrays.setAll(arr7, i -> (i + 1) * 10); // output[10,20,30,40,50]

        Arrays.parallelSort(arr7); // sort int , double , long

        




























    }
}