import java.util.*;
import java.util.Iterator;

public class _201_Hash_UnionSet {
    public static ArrayList<Integer> Union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr1) {
            set.add(x);
        }

        for (int x : arr2) {
            set.add(x);
        }

        // Iterator<Integer> it = set.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next() + " ");
        // }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        System.out.println(Union(arr1, arr2));

    }

}
