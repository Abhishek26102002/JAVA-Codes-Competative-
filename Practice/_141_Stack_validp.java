import java.util.Stack;
public class _141_Stack_validp {

    public static int findMinCost(String str) {

        if (str.length() % 2 == 1) {
            return -1;
        }

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                s.push(str.charAt(i));
            } else {
                if (!s.empty() && s.peek() == '{') {
                    s.pop();
                } else {
                    s.push(str.charAt(i));
                }
            }
        }

        int a = 0, b = 0;
        while (!s.empty()) {
            if (s.peek() == '{') {
                a++;
            } else {
                b++;
            }
            s.pop();
        }

        return (a + 1) / 2 + (b + 1) / 2;
    }
}
