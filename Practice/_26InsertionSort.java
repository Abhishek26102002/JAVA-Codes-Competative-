public class _26InsertionSort {
    public static void Is(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // piche khiskado
                j--;
            }
            arr[j + 1] = key;

        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int n = arr.length - 1;

        Is(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
