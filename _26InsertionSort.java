public class _26InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };

        for (int i = 1; i <= arr.length - 1; i++) {
            int pointer = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if(arr[j]>pointer){
                    arr[j + 1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j + 1] = pointer;
        }
        // Print Sorted Array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
