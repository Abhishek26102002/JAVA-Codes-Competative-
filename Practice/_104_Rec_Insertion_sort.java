
public class _31_Rec_Insertion_sort {
    public static void I_sort(int[] arr, int s, int e) {

        if (s > e) {
            return;
        }

        int startIndex = arr[s];
        int j = s - 1;
        for (; j >= 0; j--) {
            if (arr[j] > startIndex) {
                arr[j + 1] = arr[j];
            } else {
                break;
            }
        }
        arr[j + 1] = startIndex;
        I_sort(arr, s + 1, e);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 11, 8, 2 };
        int e = arr.length - 1;

        I_sort(arr, 0, e);

        for (int i = 0; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}