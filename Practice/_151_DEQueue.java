class DEQueue {

    int[] arr;
    int rear;
    int front;
    int size;

    // constructor
    DEQueue() {
        size = 100005;
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    // push in the front
    boolean push_front(int x) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1 + size) % size)) {
            System.out.println("Queue is Full !");
            return false; // Queue is full
        } else if (front == -1) { // First element to be inserted
            front = rear = 0;
        } else if (front == 0 && rear != size - 1) { // Cyclic nature
            front = size - 1;
        } else {
            front--;
        }

        arr[front] = x;
        return true;
    }

    // puch in the back
    boolean puch_back(int x) {
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

        arr[rear] = x;
        return true;
    }

    // pop form front
    int pop_front() {
        if (front == -1) { // empty case
            System.out.println("Queue is Empty !");
            return -1;
        }
        int ans = arr[front];
        arr[front] = -1;
        // Only one ele is present
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {// to maintain cyclic nature
            front = 0;
        } else {
            front++;
        }

        return ans;
        // return true;
    }

    // pop form back
    int pop_back() {
        if (front == -1) { // empty case
            System.out.println("Queue is Empty !");
            return -1;
        }
        int ans = arr[rear];
        arr[rear] = -1;
        // Only one ele is present
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {// to maintain cyclic nature
            rear = size - 1;
        } else {
            rear--;
        }

        return ans;
        // return true;
    }

    int getFront() {
        if (front == -1) {
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (rear == -1) {
            return -1;
        }
        return arr[rear];
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            return true;
        } else {
            return false;
        }
    }

}

public class _151_DEQueue {
    public static void main(String[] args) {

    }

}
