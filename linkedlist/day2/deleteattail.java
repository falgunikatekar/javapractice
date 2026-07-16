package linkedlist.day2;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class deleteattail {

    // Display the linked list
    public static void display(node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Delete the last node
    public static node deleteTail(node head) {

        // Case 1: List is empty
        if (head == null) {
            return null;
        }

        // Case 2: Only one node
        if (head.next == null) {
            return null;
        }

        // Traverse to the second-last node
        node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete the last node
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Original List:");
        display(head);

        head = deleteTail(head);

        System.out.println("After Deleting Tail:");
        display(head);
    }
}