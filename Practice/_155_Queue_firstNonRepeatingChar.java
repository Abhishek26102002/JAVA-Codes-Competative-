import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class method1 {

    public String FirstNonRepeating(String A) {

        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char ch : A.toCharArray()) {

            if (q.contains(ch)) {

                map.put(ch, 1);
                q.remove(ch);
                if (q.isEmpty()) {
                    ans.append('#');
                } else {
                    ans.append(q.peek());
                }
            }

            else {
                if (!map.containsKey(ch)) {
                    q.add(ch);
                }
                if (q.isEmpty()) {
                    ans.append('#');
                } else {
                    ans.append(q.peek());
                }
            }
        }
        return ans.toString();
    }
}

class method2 {  // Babbar Sir ka Java Version

    public String FirstNonRepeating(String A) {
        Map<Character, Integer> count = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // Increment count
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            // Add to queue
            q.add(ch);

            while (!q.isEmpty()) {
                if (count.get(q.peek()) > 1) {
                    q.poll();
                } else {
                    ans.append(q.peek());
                    break;
                }
            }
            if (q.isEmpty()) {
                ans.append("#");
            }
        }
        return ans.toString();
    }

}

class m3 { // simple method

    public static String FirstNonRepeating(String A) {
        int[] freq = new int[26]; // frequency array to track the frequency of elements
        Queue<Character> que = new LinkedList<>(); // queue to track the elements of the stream with one frequency
        StringBuilder ans = new StringBuilder(); // using StringBuilder for better performance

        for (int i = 0; i < A.length(); i++) {
            freq[A.charAt(i) - 'a']++;

            if (freq[A.charAt(i) - 'a'] == 1) {
                que.offer(A.charAt(i));
            }

            // remove all the elements from the beginning of the queue which are having frequency greater than 1
            while (!que.isEmpty() && freq[que.peek() - 'a'] > 1) {
                que.poll();
            }

            // if que is empty then append '#' to answer; otherwise, append the character
            if (que.isEmpty()) {
                ans.append("#");
            } else {
                ans.append(que.peek());
            }
        }

        // finally return the answer
        return ans.toString();
    }
}

public class _155_Queue_firstNonRepeatingChar {
    public static void main(String[] args) {

    }
}
