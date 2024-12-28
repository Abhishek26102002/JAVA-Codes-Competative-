import java.util.Stack;

public class _144_Stack_largestAreaOfHistogram {
    // Function to find largest rectangular area possible in a given histogram.
    // Brutforce Complexity O(n^2);

    // Correct Code but time limits exceeds
    public static long getMaxArea(long hist[], long n) {
        long area = 0;

        for (int i = 0; i < n; i++) {
            long curr = hist[i];
            long a = 0, b = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (hist[j] >= curr) {
                    a++;
                } else {
                    break;
                }
            }
            for (int k = i + 1; k < n; k++) {
                if (hist[k] >= curr) {
                    b++;
                } else {
                    break;
                }
            }
            long new_area = curr * (a + b + 1);
            if (area < new_area) {
                area = new_area;
            }

        }
        return area;

    }

    // Method 2 Stack wala
    class Solution {
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

        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
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
    }

    //--------------------------------------------------------
    //Long Type ANS   GKG

    
    class Ch {
        public static int[] nextSmallerEle(long[] hist, long n) {
            Stack<Integer> s = new Stack<>();
            int[] ans = new int[(int) n];
            s.push(-1);
    
            for (int i = (int) (n - 1); i >= 0; i--) {
                int curr = (int) hist[i];
                while (s.peek() != -1 && curr <= hist[s.peek()]) {
                    s.pop();
                }
                ans[i] = s.peek();
                s.push(i);
            }
            return ans;
        }
    
        public static int[] prevSmallerEle(long[] hist, long n) {
            Stack<Integer> s = new Stack<>();
            int[] ans = new int[(int) n];
            s.push(-1);
    
            for (int i = 0; i < n; i++) {
                int curr = (int) hist[i];
                while (s.peek() != -1 && curr <= hist[s.peek()]) {
                    s.pop();
                }
                ans[i] = s.peek();
                s.push(i);
            }
            return ans;
        }
    
        public static long getMaxArea(long hist[], long n) {
    
            Stack<Integer> s = new Stack<>();
    
            int[] next = nextSmallerEle(hist, n);
            int[] prev = prevSmallerEle(hist, n);
    
            long new_Area = 0;
            for (int i = 0; i < n; i++) {
                long l = hist[i];
    
                if (next[i] == -1) {
                    next[i] = (int) n;
                }
                long b = next[i] - prev[i] - 1;
    
                long area = l * b;
                if (new_Area < area) {
                    new_Area = area;
                }
            }
            return new_Area;
        }
    }
}
