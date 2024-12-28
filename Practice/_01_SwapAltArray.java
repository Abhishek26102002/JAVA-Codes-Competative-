public class _01_SwapAltArray {

    public static int[] solve(int[] arr) {
        int size = arr.length;
        int temp;

        for (int i = 0; i < size - 1; i = i + 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 23, 5, 88, 9 };

        solve(arr);
        
        for(int x:arr){
            System.out.print(x +" ,");
        }
    }
}
