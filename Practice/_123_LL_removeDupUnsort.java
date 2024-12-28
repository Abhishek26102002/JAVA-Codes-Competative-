import java.util.HashMap;
import java.util.Map;

public class _123_LL_removeDupUnsort {

    // Using  Floyds Cycle detection algo
    public class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];
            
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            
            return slow;
        }
    }
    

    // Two Loop Method Time Complextiy=O(n^2) space Completity = O(1)
     Node removeDuplicatesUnsort(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    //--------------------------------------------------------------

    // Map or Hashing mathod Time=O(n) and space =O(n)

    public Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }

        Map<Integer, Boolean> map = new HashMap<>();
        Node curr = head;
        Node prev = head;

        while (curr != null) {
            if (map.containsKey(curr.data)) {
                // Duplicate node found, move to the next node
                prev.next = curr.next;
            } else {
                // Unique node, add to the map and move to the next node
                map.put(curr.data, true);
                prev = curr;
            }

            curr = curr.next;
        }

        return head;
    }
    //-----------------------------------------------------------

    //Using Sorting



}




   