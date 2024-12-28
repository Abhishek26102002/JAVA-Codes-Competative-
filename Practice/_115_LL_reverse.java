public class _115_LL_reverse {
    private Node head;
    private Node tail;

    class Node {
        public int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    //------------------------Method 1(Recursion)
    //------------------------------------------
    public static Node solve1(Node head) {
        if (head == null || head.next == null) { // no ele and one ele;
            return head;
        }

        Node smallHead = solve1(head.next);
        head.next.next = head;
        head.next = null;
        return smallHead;

    }

    public static Node Reverse1(Node head) {

        return solve1(head);
    }

        
    //------------------------Method 2(Recursion)
    //----------------------------------------------------------------------

    public static Node solve2(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node forward = curr.next;
        curr.next = prev;
        return solve2(forward, curr);
    }

    public Node Reverse2(Node head){

        Node curr = head;
        Node prev = null;
        
        head = solve2(curr, prev);
        return head;
        
    }


    //------------------------Method 3 (direct method Easy One)
    //----------------------------------------------------------------------
    public Node Reverse3(Node head){

        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node forward=null;

        while(curr!=null){
          forward=curr.next;  
          curr.next=prev;
          prev=curr;
          curr=forward;
        }
        return prev;
    }
    //----------------------------------------------------------------------





}
