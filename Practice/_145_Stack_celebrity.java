import java.util.Stack;

public class _145_Stack_celebrity {

    // Brute Force complexity O(n^2)

    int celebrity(int M[][], int n) {
        for (int i = 0; i < n; i++) {
            boolean isCelebrity = true;
            for (int j = 0; j < n; j++) {
                if (i != j && M[i][j] == 1) { // If i knows someone, it cannot be a celebrity
                    isCelebrity = false;
                    break;
                }
            }
            if (isCelebrity) {
                boolean isKnownByAll = true;
                for (int k = 0; k < n; k++) {
                    if (M[k][i] == 0 && k != i) { // If someone doesn't know i, it cannot be a celebrity
                        isKnownByAll = false;
                        break;
                    }
                }
                if (isKnownByAll) {
                    return i; // i is a celebrity
                }
            }
        }
        return -1; // No celebrity found
    }

    // Method 2 using Stack
    // time =O(n) , space = O(n)

    int celebrity2(int M[][], int n) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() != 1) {
            int a = s.pop();
            int b = s.pop();

            // if a knows b ??
            if (M[a][b] == 1) {
                s.push(b);
            }
            // if b knows a ??
            else {
                s.push(a);
            }
        }
        // Now the last ele is potential candidate
        int c = s.pop();
        boolean row = true;
        boolean col = true;

        // row check
        for (int i = 0; i < n; i++) {
            if (M[c][i] == 1 && c != i) {
                row = false;
                break;
            }
        }

        // col check
        for (int i = 0; i < n; i++) {
            if (M[i][c] == 0 && c != i) {
                col = false;
                break;
            }
        }
        if (col == true && row == true) {
            return c;
        }
        return -1;

        // OPtimised Loop for row and col chevk simultanously.

        // for (int i = 0; i < n; i++) {
        // if (i != c && (M[c][i] == 1 || M[i][c] == 0)) { // Check row and column
        // return -1; // c is not a celebrity
        // }
        // }

        // return c;
    }
}
