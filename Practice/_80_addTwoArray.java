import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

    dont know what this code does !!!
public class _80_addTwoArray {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4 };
        int[] b = { 9 };
        int carry = 0;
        int i = a.length - 1; // start piche se krna hai i.e piche se add krn start krna hai
        int j = b.length - 1; // start piche se krna hai i.e piche se add krn start krna hai
        List<Integer> ans = new ArrayList<>();

        // case 1 when both have the same length
        while (i >= 0 && j >= 0) {
            int sum = a[i] + b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }

        // case 2 jb phele array bada hai
        while (i >= 0) {
            int sum = a[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }
        // case 3 jab second array bada hai
        while (j >= 0) {
            int sum = b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }
        // case 4 carry aage ka bacha hua hai
        while (carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        Collections.reverse(ans); // ans should be ArrayList type
        System.out.print(ans);

    }
}