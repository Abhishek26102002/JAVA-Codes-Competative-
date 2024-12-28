// Given two strings s1 and s2, return true if s2 contains a 
// permutation
//  of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:

// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false

import java.util.*;

class Solution {
    public boolean checkInclusion(String p, String s) {
        if (p.length() > s.length())
            return false;
        int[] f1 = new int[26], f2 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            f1[p.charAt(i) - 'a']++;
            f2[s.charAt(i) - 'a']++;
        }
        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(f1, f2))
                return true;
            f2[s.charAt(i) - 'a']++;
            f2[s.charAt(i - p.length()) - 'a']--;
        }
        return Arrays.equals(f1, f2);
    }
}