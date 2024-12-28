import java.util.*;

class _18mergTwoArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        int[] c = new int[a.length + b.length];// defining the length of c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        for(int x:c){
            System.out.print(x+" ");
        }
    }
}