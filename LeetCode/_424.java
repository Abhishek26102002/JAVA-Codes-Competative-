import java.util.*;

public class _424 {

    public static int characterReplacementBrutforce(String s, int k) {
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (canBeMadeUniform(s, i, j, k)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    private static boolean canBeMadeUniform(String s, int start, int end, int k) {
        int[] freq = new int[26]; // Store character frequencies
        int maxFreq = 0;
        
        for (int i = start; i <= end; i++) {
            freq[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(i) - 'A']);
        }

        int totalChars = end - start + 1;
        return (totalChars - maxFreq) <= k; // Check if we can replace at most k characters
    }

    public static int characterReplacementOptimized(String s, int k) {
        int[] freq = new int[26]; // Frequency array for characters A-Z
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++; 
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']); 

            // If more than k replacements are needed, shrink the window
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--; 
                left++; 
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }



    public static int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0, j = 0, replaced = 0;
            while (j < n) {
                if (s.charAt(j) == c) {
                    j++;
                } else if (replaced < k) {
                    j++;
                    replaced++;
                } else if (s.charAt(i) == c) {
                    i++;
                } else {
                    i++;
                    replaced--;
                }
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }

    public static int characterReplacement2(String s, int k) {
        int[] count = new int[26];
        int i = 0, j = 0, maxfreq = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        while (i < s.length()) {
            count[s.charAt(i) - 'A']++;
            maxfreq = Math.max(maxfreq, count[s.charAt(i) - 'A']);
            int changes = (i - j + 1) - maxfreq; // length - maxfreq
            if (changes > k) {
                count[s.charAt(j) - 'A']--;
                j++;
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        return result;
    }

    public static void main(String args[]) {
        String s = "AABABBBBAB";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}