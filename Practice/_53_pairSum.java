import java.util.*;

public class _53_pairSum {
    public static List<List<Integer>> findDuplicates(int[] arr, int s) {
        List<List<Integer>> list = new ArrayList<>();// to store list under list

        for (int i = 0; i < arr.length && arr[i]<s; i++) {
            for (int j = i + 1; j < arr.length && arr[j]<s; j++) {
                if (arr[i] + arr[j] == s) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);

                    // idk why i use math function may be help in future
                    // temp.add(Math.min(arr[i], arr[j]));
                    // temp.add(Math.max(arr[i], arr[j]));
                    list.add(temp);
                }
            }
        }
        Arrays.sort(arr);// sort the ans
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int s = 5;// what sum u req
        List<List<Integer>> ans = findDuplicates(arr, s);
        System.out.println(ans);
    }
}
