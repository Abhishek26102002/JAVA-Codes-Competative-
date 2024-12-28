import java.util.*;

public class _202_Hash_Intersection {
    public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> a=new ArrayList<>();
        
        for (int x : arr1) {
            set.add(x);
        }

        for (int x : arr2) {
            if (set.contains(x)) {
                a.add(x);
                set.remove(x);
            }
        }

        return a;

    }

    public static void main(String[] args) {

        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        System.out.println(Intersection(arr1, arr2));
        System.out.println(Intersection(arr1, arr2).size());

    }

}
