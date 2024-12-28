import java.util.*;

public class _52_findDuplicate {
    public static List<Integer> findDuplicates(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4 };
        List<Integer> ans = findDuplicates(arr1, arr2);
        System.out.println(ans);
    }
}
