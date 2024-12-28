import java.util.*;
import java.io.*;


public class _134_Stack_delMid {

    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        int mid;
        if (N % 2 == 0) {
            mid = N / 2;
        } else {
            mid = N / 2 + 1;
        }

        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < mid; i++) {
            if (!inputStack.isEmpty()) {
                temp.push(inputStack.peek());
                inputStack.pop();
            }
        }
        temp.pop();
        for (int i = 0; i < mid; i++) {
            if (!temp.isEmpty()) {
                inputStack.push(temp.peek());
                temp.pop();
            }
        }
    }
}
