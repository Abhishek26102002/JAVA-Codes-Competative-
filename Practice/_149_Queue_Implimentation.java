class myQueue {

    int[] arr;
    int rear;
    int front;
    int size;

    // constructor
    myQueue() {
        size = 100005;
        arr = new int[size];
        rear = 0;
        front = 0;
    }

    void push(int data) {
        if (rear == size) {
            System.out.println("Queue is Full !");
        } else {
            arr[rear] = data;
            rear++;
        }
    }

    int pop() {
        if (front == rear) {
            System.out.println("Queue is Empty cannot popped !!");
            return -1;
        } else {
            int ans = arr[front];
            arr[front] = -1;
            front++;
            if (front == rear) {
                front = 0;
                rear = 0;
            }
            return ans;
        }
    }

    int front() {
        if (front == rear) {
            System.out.println("Queue is Empty ! Nothing in fornt.");
            return -1;
        }
        return arr[front];
    }

    int rear() {
        if (front == rear) {
            System.out.println("Queue is Empty ! Nothing in rear.");
            return -1;
        }
        return arr[rear];

    }

    boolean isEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    }
    // class End
}

public class _149_Queue_Implimentation {

    public static void main(String[] args) {

        myQueue q = new myQueue();

        q.push(2);
        q.push(23);
        q.push(5);
        q.push(12);
        q.push(90);

       System.out.println(q.front()); 

       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q.pop());

       System.out.println(q.isEmpty());

       System.out.println(q.rear());

    }

}
