import java.util.*;
import java.io.*;

public class _135_Stack_findMid {

    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        solve(inputStack, 0, N);
    }

    public static void solve(Stack<Integer> inputStack, int count, int N) {
        // base condition
        if (count == (N - 1) / 2) {
            inputStack.pop();
            return;
        }
        int num = inputStack.peek();
        inputStack.pop();
        // recursive call
        solve(inputStack, count + 1, N);
        inputStack.push(num);
    }

}
