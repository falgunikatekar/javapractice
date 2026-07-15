package linkedlist.day2;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

class linkedlist {
    node head;
    node tail;

    // Display Linked List
    public static void display(node temp) {
        if (temp == null) {
            System.out.println("List is empty");
            return; // Good practice to stop execution
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at Head
    public static node insertathead(node temp, int val) {

        // If list is empty, create first node and return it.
        if (temp == null) {
            return new node(val);
        }

        node a = new node(val);

        // ===================== ERRORS IN YOUR CODE =====================

        // ERROR 1:
        // a = temp.next;
        // This line makes 'a' point to the second node.
        // The newly created node is lost.

        // ERROR 2:
        // You should connect the new node to the old head.
        a.next = temp;

        // ERROR 3:
        // Your method was void.
        // Changing 'temp' inside this method does NOT change 'head' in main().
        // Therefore return the new head.
        return a;
    }
}

public class pra {
    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        linkedlist.display(head);

        System.out.println("\nAfter inserting at head:");

        // ERROR 4:
        // Your original code:
        // linkedlist.insertathead(head,72);
        //
        // This does nothing because the returned head is ignored.

        head = linkedlist.insertathead(head, 72);

        linkedlist.display(head);
    }
}