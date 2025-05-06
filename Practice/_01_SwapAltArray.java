public class _01_SwapAltArray {

    public static void solve(int[] arr) {
        int i = 0, j = i + 1;
        while (j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i = j + 1;
            j = i + 1;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 23, 5, 88, 9 };

        solve(arr);

        for (int x : arr) {
            System.out.print(x + " ,");
        }
    }
}
