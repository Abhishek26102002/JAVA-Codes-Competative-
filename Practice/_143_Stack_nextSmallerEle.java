import java.util.Stack;

public class _143_Stack_nextSmallerEle {

    // User function Template for Java

    class Solution {
        public static int[] help_classmate(int arr[], int n) {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                int curr = arr[i];
                for (int j = i + 1; j < n; j++) {
                    if (curr > arr[j]) {
                        ans[i] = arr[j];
                        break;
                    } else {
                        ans[i] = -1;
                    }
                }
                if (i == n - 1) {
                    ans[i] = -1;
                }
            }
            return ans;
        }

    }

    // Method 2 Stack

class Solution2 {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    Stack<Integer> s=new Stack<>();
	    int[] ans=new int[n];
	    s.push(-1);
	    
	    for(int i=n-1;i>=0;i--){
	        int curr=arr[i];
	       while(curr<=s.peek()){
	           s.pop();
	           }
	           ans[i]=s.peek();
	           s.push(curr);
	    }
	    //----------------end---------------
	    return ans;
	} 
}
}
