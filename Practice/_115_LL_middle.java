class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }
 //-----------------------------------------------------------------------------
 //code starts form here;  --> Code studio middle of linkedlist

public class _115_LL_middle {
    public static Node solve(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        Node ans = head;
        for (int i = 0; i < count / 2; i++) {
            ans = ans.next;
        }
        return ans;
    }

    public static Node findMiddle(Node head) {
        return solve(head);
    }
}

// orr 2 pointer method trutle and rabbit (fast & slow) 
/*
public class Solution
{
    public static Node solve(Node head){
       if(head==null || head.next==null){
           return head;
       }
       if(head.next.next==null){
          return head.next;
       }

       Node slow=head;
       Node fast=head.next;
       while(fast!=null){
           fast=fast.next;
           if(fast!=null){
               fast=fast.next;
           }
            slow=slow.next;
       }
       return slow;
       

    }
    public static Node findMiddle(Node head)
    {
        return solve(head);
    }
}
 */