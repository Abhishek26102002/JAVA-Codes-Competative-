import java.util.*;
import java.util.Arrays;

public class _91_MappingOFEle {
    public static void main(String[] args) {

        String str = "aabacde".toLowerCase();
        char[] ch = str.toCharArray();
        int[] arr = new int[128];
        Arrays.sort(ch);

        // ** MAPPING A-0 B-0 C-0 i.e initially count if every ele is 0

        for (int i = 0; i < ch.length; i++) {
            // arr[ch[i]];
            System.out.println("arr[ch[" + i + "]]++ is :" + ch[i] + "  x is " + arr[ch[i]]);
        }

        System.out.println("\n\nCount ele\n\n");

        // ele count
        for (int i = 0; i < ch.length; i++) {
            // arr[ch[i]]++;
            System.out.println("arr[ch[" + i + "]]++ is :" + ch[i] + "  x is " + arr[ch[i]]++);
        }

    }
}