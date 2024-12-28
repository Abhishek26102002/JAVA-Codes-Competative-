import java.util.*;
import java.util.HashSet;

public class _42_Rec_subseqString {
    public static void Subseq(String str, String newstr, int s, HashSet<String> set) {
        // base
        if (s == str.length()) {
            if (set.contains(newstr)) {
                return;
            }
            else{
                System.out.print("{" + newstr + "} ,");
                set.add(newstr);
                return;
            }
        }
        char currentChar = str.charAt(s);
        
        // ele aana chahata hai
        Subseq(str, newstr + currentChar, s + 1,set);

        // ele nahi aana chahata
        Subseq(str, newstr, s + 1,set);

    }

    public static void main(String args[]) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        Subseq(str, "", 0, set);

    }
}