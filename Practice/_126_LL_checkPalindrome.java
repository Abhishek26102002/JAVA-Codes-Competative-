import java.util.ArrayList;
import java.util.List;

// time=O(n) Space =O(n)
public class _126_LL_checkPalindrome {
     boolean checkPalindrome(List<Integer> arr){
        int n=arr.size();
        int s=0;
        int e=n-1;

        while(s<=e){
            if(arr.get(s)!=arr.get(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
        
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        List<Integer> arr=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            arr.add(curr.data);
            curr=curr.next;
        }
        return checkPalindrome(arr);
    }    
    
}
//method 2  
// time=O(n) Space =O(1)  -> Better Space complexity
class Solution
{
    Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=after;
        }
        return prev;
        
    }
    Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
       if(head.next==null){
           return true;
       }
       //step 1 : middle Node chahie
       Node midd=getMid(head);
       
       //step 2 : reverse after middle node
       Node temp = midd.next;
       midd.next = reverse(temp);
       
       //Step 3: compare Both halves
       Node head1=head;
       Node head2=midd.next;
       
       while(head2!=null){
           if(head1.data!=head2.data){
               return false;
           }
           head1=head1.next;
           head2=head2.next;
       }

       //-------Step 4 : send linkedlist as it is (OPTIONAL) i.e repeat step 2
       temp = midd.next;
       midd.next = reverse(temp);
       //---------------End of Step 4

        return true;       
    }    
}
