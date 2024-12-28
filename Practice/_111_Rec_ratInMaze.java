import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class _111_Rec_ratInMaze {
    public static boolean isSafe(int x, int y, int n, int[][] visited, int[][] m) {
        if ((x >= 0 && x < n) && (y >= 0 && y < n) && visited[x][y] == 0 && m[x][y] == 1) {
            return true;
        }
       return false;
    }
    public static void solve(int[][] m, int n, int x, int y, int[][] visited, String path, ArrayList<String> ans) {
        // initially x==0 , y ==0

        // base case
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }
        visited[x][y] = 1;
        // down
        int newx = x + 1;
        int newy = y;
        if (isSafe(newx, newy, n, visited, m)) {
            char ch = 'D';// this is how you push and pop in java
            solve(m, n, newx, newy, visited, path + ch, ans);
        }
        // up
        newx = x - 1;
        newy = y;
        if (isSafe(newx, newy, n, visited, m)) {
            char ch = 'U'; // this is how you push and pop in java
            solve(m, n, newx, newy, visited, path + ch, ans);
        }
        // left
        newx = x;
        newy = y - 1;

        if (isSafe(newx, newy, n, visited, m)) {
            char ch = 'L';// this is how you push and pop in java
            solve(m, n, newx, newy, visited, path + ch, ans);
        }
        // Right
        newx = x;
        newy = y + 1;
        if (isSafe(newx, newy, n, visited, m)) {
            char ch = 'R';// this is how you push and pop in java
            solve(m, n, newx, newy, visited, path + ch, ans);
        }

        visited[x][y] = 0;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        // if source of mouse is 0 return null ans
        if (m[0][0] == 0) {
            return ans;
        }
        // initially
        int src_x = 0;
        int src_y = 0;

        int[][] visited = new int[n][n]; // making visited array of same size
        // every vall is NULL i.e 0
        String path = ""; // eg. DDULR

        solve(m, n, src_x, src_y, visited, path, ans);
        ans.sort(null); // sort array in normal order

        return ans;
    }

    public static void main(String args[]) {
        int m[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };
        int n = 4;
        System.out.println(findPath(m, n));
    }
}