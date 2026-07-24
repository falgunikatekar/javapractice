package queue;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void add(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    int remove() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int value = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return value;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class link {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

        System.out.println("Removed: " + list.remove());

        list.display();
    }
}