public class _121_LL_removeLoop {
  // optimised Solution
  public static void removeLoop(Node head) {
    if (head == null)
      return;
    Node slow = head;
    Node fast = head;
    int f = 0;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        f = 1;
        break;
      }
    }
    if (fast == null || fast.next == null)
      return;
    slow = head;
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    while (slow != fast.next) {
      fast = fast.next;
    }
    fast.next = null;

  }
}
