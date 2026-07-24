package queue;

class List {

    int front = -1;
    int rear = -1;

    void add(int val, int[] arr) {

        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = val;
    }

    int remove(int[] arr) {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];
        front++;

        return value;
    }

    void display(int[] arr) {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class usingarray {

    public static void main(String[] args) {

        int[] arr = new int[8];

        List q = new List();

        q.add(3, arr);
        q.add(4, arr);
        q.add(5, arr);

        q.display(arr);

        System.out.println("Removed: " + q.remove(arr));

        q.display(arr);
    }
}