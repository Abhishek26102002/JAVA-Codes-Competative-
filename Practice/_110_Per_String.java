import java.util.ArrayList;
import java.util.Collections;

public class _110_Per_String {

    public static String swap(String str, int i, int j) {
        char arr[] = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void solve(String str, int index, ArrayList<String> list) {
        if (index == str.length()) {
            list.add(str);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            // swap itself
            str = swap(str, index, i);
            // recusrive call
            solve(str, index + 1, list);
            // backtrack
            str = swap(str, index, i);
        }
    }

    public static ArrayList<String> generatePermutations(String str) {
        ArrayList<String> list = new ArrayList<>();
        solve(str, 0, list);
        Collections.sort(list);
        return list;
    }

    public static void main(String args[]) {

        String str = "ABC";
        System.out.println(generatePermutations(str));

    }
}