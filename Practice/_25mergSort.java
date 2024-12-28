
public class _25mergSort {
       public static void mergTwoHalves(int[] a, int l, int mid, int r) {

        int[] b = new int[r-l+1];
        int i = l;// purana arr k lie
        int j = mid + 1; // purr arr k lie
        int k = 0; // naya wala ka

        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

       
        if (i > mid) {
            while (j <= r) {// Copy remaining elements of the right half, if any
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {// Copy remaining elements of the left half, if any
                b[k] = a[i];
                k++;
                i++;
            }
        }

       // Copy the merged array back to the original array
        for (int m = 0; m < b.length; m++) {
            a[l+m] = b[m];
        }

    }

    public static void mergsort(int[] a, int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;

        // left ko sort kro
        mergsort(a, l, mid);

        // right ko sort kro
        mergsort(a, mid + 1, r);

        // dono left right ko merg kro
        mergTwoHalves(a, l, mid, r);

    }

 

    public static void main(String args[]) {
        int[] a = { 5, 56, 9, 8, 1, 2, 7, 3, 5, 6 };
        int n = a.length - 1;

        mergsort(a, 0, n);
        for(int x:a){
            System.out.print(x+" ");
        }

    }
}
