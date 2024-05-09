public class _01_SwapAltArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 23, 5, 88,9 };
        int size = arr.length;

        // through loop

        int temp;

        for (int i = 0; i < size-1; i=i+2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Swap(arr, 0, size-1);

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
