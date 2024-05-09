import java.io.*;

class _47_uniqueNumofOcc {

    static int countDistinct(int arr[], int n) {
        int count = 1;

        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }
}
// can be done using
//sorting
//hashing(all method related to hasing)
// also done using mapping