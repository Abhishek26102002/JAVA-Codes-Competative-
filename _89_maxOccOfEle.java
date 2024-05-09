import java.util.*;

public class _89_maxOccOfEle {

    static char getMaxOccurringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256]; // ASCII_SIZE = 256;

        // Construct character count array from the input
        // string.
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("Max occurring character is ==> " + getMaxOccurringChar(str));

    }
}

// more method also availabe check Geeks for Geeks