package linkedlist.day2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    // Display Linked List
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Count number of nodes
    public static int count(Node temp) {
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Find Intersection Node
    public static Node intersection(Node n1, Node n2) {

        int a = count(n1);
        int b = count(n2);

        int diff = Math.abs(a - b);

        // Move the pointer of the longer list
        if (a > b) {
            for (int i = 0; i < diff; i++) {
                n1 = n1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                n2 = n2.next;
            }
        }

        // Traverse both lists together
        while (n1 != null && n2 != null) {
            if (n1 == n2) {
                return n1;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        return null;
    }
}

public class intersection {

    public static void main(String[] args) {

        // Common Part
        Node t1 = new Node(70);
        Node t2 = new Node(80);
        Node t3 = new Node(90);

        t1.next = t2;
        t2.next = t3;

        // First Linked List
        Node h1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        h1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = t1;

        // Second Linked List
        Node h2 = new Node(50);
        Node n5 = new Node(60);

        h2.next = n5;
        n5.next = t1;

        System.out.println("First Linked List:");
        LinkedList.display(h1);

        System.out.println("\nSecond Linked List:");
        LinkedList.display(h2);

        // Find intersection
        Node ans = LinkedList.intersection(h1, h2);

        if (ans != null) {
            System.out.println("\nIntersection Node = " + ans.data);
        } else {
            System.out.println("\nNo Intersection Found");
        }
    }
}