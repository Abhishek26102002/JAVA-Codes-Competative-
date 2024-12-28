import java.util.Stack;

/*Complexity O(n)*/

public class _133_Stack_rev_String {

    public static void main(String args[]) {

        String str="Abhishek";
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);
        }
        String ans ="";

        
        while(!s.empty()){
            char ch=s.peek();
            ans+=ch;
            s.pop();
        }
        System.out.println(ans);

    }
}
