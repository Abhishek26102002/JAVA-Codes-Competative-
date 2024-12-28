import java.util.*;

public class _57_FirstAnsLastOcc {
    public static int firstOcc(int[] arr, int n, int key) {
        int s = 0, e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;// first occ ke lie hum yaha par left part mai already ja rhe hai
            } else if (key > arr[mid]) {// right mai jao
                s = mid + 1;
            } else if (arr[mid] > key) {// left mai jao
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return ans;
    }

    public static int lastOcc(int[] arr, int n, int key) {
        int s = 0, e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;// first occ ke lie hum yaha par left part mai already ja rhe hai
            } else if (key > arr[mid]) {// right mai jao
                s = mid + 1;
            } else if (arr[mid] > key) {// left mai jao
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return ans;
    }

    // Method 2
    public static void Occ(int[] arr, int key) {
        int first = 0;
        int last = 0;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i] && first == 0) {
                first = i;
            }
            if (key == arr[i]) {
                last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 25 };
        int n = arr.length;
        int key = 2;
        System.out.println("First Occ of " + key + " at index " + firstOcc(arr, n, key));
        System.out.println("Last Occ of " + key + " at index " + lastOcc(arr, n, key));

        Occ(arr, key);
    }
}

//or By me
/*import java.util.*;

public class Ch {
    
} */