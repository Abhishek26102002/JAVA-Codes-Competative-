import java.util.*;

public class _146_stack_LargestRectangleArea {

    public static int[] nextSmallerEle(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        s.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (s.peek() != -1 && curr <= arr[s.peek()]) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    public static int[] prevSmallerEle(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        s.push(-1);

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (s.peek() != -1 && curr <= arr[s.peek()]) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights, int n) {
        // int n = heights.length;
        Stack<Integer> s = new Stack<>();

        int[] next = nextSmallerEle(heights, n);
        int[] prev = prevSmallerEle(heights, n);

        int new_Area = 0;
        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1) {
                next[i] = n;
            }
            int b = next[i] - prev[i] - 1;

            int area = l * b;
            if (new_Area < area) {
                new_Area = area;
            }
        }
        return new_Area;
    }

    public int maxArea(int M[][], int n, int m) {
        int area = largestRectangleArea(M[0], m);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] != 0) {
                    M[i][j] = M[i][j] + M[i - 1][j];// curr row + ek uper wala row
                } else {
                    M[i][j] = 0;
                }
            }
            int newArea = largestRectangleArea(M[i], m);
            if (area < newArea) {
                area = newArea;
            }
        }
        return area;
    }
}