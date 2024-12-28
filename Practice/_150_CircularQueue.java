class MyCircularQueue {

    int[] arr;
    int rear;
    int front;
    int size;

    public MyCircularQueue(int k) {
        size = k;
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public boolean enQueue(int value) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1 + size) % size)) {
            System.out.println("Queue is Full !");
            return false; // Queue is full
        } else if (front == -1) { // First element to be inserted
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) { // Cyclic nature
            rear = 0;
        } else {
            rear++;
        }

        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (front == -1) { // empty case
            System.out.println("Queue is Empty !");

            return false;
        }
        // int ans = arr[front];
        arr[front] = -1;
        // Only one ele is present
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {// to maintain cyclic nature
            front = 0;
        } else {
            front++;
        }

        // return ans;
        return true;
    }

    public int Front() {
        if (front == -1) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (rear == -1) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            return true;
        } else {
            return false;
        }
    }
}

public class _150_CircularQueue {
    public static void main(String[] args) {

    }

}
