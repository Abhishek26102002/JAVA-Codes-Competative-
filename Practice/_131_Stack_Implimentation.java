import java.util.*;

class customStack {

    int size;
    int top = -1;
    int[] arr;

    customStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int data) {
        if (size - top > 0) {
            top++;
            arr[top] = data;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty cannot pop !!");
            return -1;
        } else {
            return arr[top--];

        }
    }

    int peek() {
        if (top >= 0) {
            System.out.print("top item :"  );
            return arr[top];
        }
        else{
            System.out.println("Stack is Empty");
            
        }
        return -1;
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

}

public class _131_Stack_Implimentation {
    public static void main(String args[]) {

        customStack stack1=new customStack(5);

        stack1.push(1);
        stack1.push(13);
        stack1.push(16);
        stack1.push(18);
        
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());

        System.out.println( stack1.peek());
       
        System.out.println("is Stack Empty ? : "+stack1.isEmpty());
    }
}