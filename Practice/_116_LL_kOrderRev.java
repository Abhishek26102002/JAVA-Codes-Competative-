public class _116_LL_kOrderRev {
        public static Node kReverse(Node head, int k) {
            if (head == null || head.next == null)
            {
                return head;
            }
            Node curr = head;
            int n = 0;
    
            //count till the ele i.e to be reversed
            while (curr != null && n != k)
            {
                curr = curr.next;
                n++;
            }
            if (n == k)
            {
                curr = kReverse(curr, k);
                while (n-- > 0)
                {
                    Node temp = head.next;
                    head.next = curr;
                    curr = head;
                    head = temp;
                }
                head = curr;
            }
            return head;
    
        }
}
