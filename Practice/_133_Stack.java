import java.util.*;

class myStack {
    
    protected int[] arr; // cannot be access.

    private static final int DEFAULT_SIZE = 10; // cannot be changed
    int top = -1;

    // If the size of array/Stack is not provided then this one is called.
    public myStack() {
        this(DEFAULT_SIZE);
    }

    // else this one called (See OOPs vid Kunal kuswaha)
    public myStack(int size) {
        this.arr = new int[size];

    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full !");
            return false;
        }
        top++;
        arr[top] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot Pop item Form Empty Stack");
        }
        int removed = arr[top];
        top--;
        return removed;
    }


    public int peek() throws Exception{
         if (isEmpty()) {
            throw new Exception("Cannot peek item Form Empty Stack");
        }
        return arr[top];
    } 


    public boolean isFull() {
        return top == arr.length - 1;// top is at the last
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class _133_Stack {
    public static void main(String args[]) throws Exception {

        myStack stack1=new myStack(5);

        
        stack1.push(1);
        stack1.push(13);
        stack1.push(16);
        stack1.push(18);
        
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());
        System.out.println("pop ele :"+stack1.pop());

    }
}