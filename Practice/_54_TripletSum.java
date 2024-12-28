import java.util.*;

public class _54_TripletSum {
    public static List<List<Integer>> findDuplicates(int[] arr, int s) {
        List<List<Integer>> list = new ArrayList<>();// to store list under list
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for(int k=j+1;k<arr.length;k++){

                    if (arr[i] + arr[j]+arr[k] == s) {
                        List<Integer> temp = new ArrayList<>();
                        // temp.add(Math.min(arr[i], arr[j]));
                        // temp.add(Math.max(arr[i], arr[j]));
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        list.add(temp);
                    }
                }
            }
        }
        Arrays.sort(arr);// sort the ans
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int s = 8;
        List<List<Integer>> ans = findDuplicates(arr, s);
        System.out.println(ans);
    }
}
