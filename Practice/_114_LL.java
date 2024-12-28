class LLK {
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

    public void AF(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;

        // If it's the first node, both head and tail should point to it.
        if (tail == null) {
            tail = head;
        }

    }

    public void AP(int position, int data) {
        if (position == 1) {
            AF(data);
            return;
        }
        Node temp = head;
        int count = 1;

        while (count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            AL(data);
            return;
        }

        Node nodeToInsert = new Node(data);
        nodeToInsert.next = temp.next;
        temp.next = nodeToInsert;

    }

    public void AL(int data) {
        Node temp = new Node(data);

        // If the list is empty
        if (head == null) {
            head = temp;
            tail = temp;
            return;
        }

        // Otherwise, add the new node at the tail.
        tail.next = temp;
        tail = temp;

    }

     public static Node solve(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node forward = curr.next;
        curr.next = prev;
        return solve(forward, curr);
    }

    public Node Reverse(Node head){

        //------------
        Node curr = head;
        Node prev = null;
        
        head = solve(curr, prev);
        return head;
        //------------

        
        /* 
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
        */
    }

    // Another methods

    /* public static Node solve(Node head) {
        if (head==null || head.next==null){ // no ele and one ele;
            return head;
        }

        Node smallHead= solve(head.next);
        head.next.next=head;
        head.next=null;
        return smallHead;

    }

    public static Node reverseLinkedList(Node head) {
        
        return solve(head);
    } */

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class _114_LL {

    public static void main(String args[]) {

        LLK list = new LLK();
        list.AF(10);
        list.AF(12);
        list.AL(90);
        list.AP(4, 15);
        list.display();

        list.Reverse(null);
        list.display();

    }
}