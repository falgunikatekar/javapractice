class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    // Update node value at a given position (0-based indexing)
    public static node update_(node head, int pos, int val) {

        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        // Check for invalid position
        if (pos < 0) {
            System.out.println("Invalid Position");
            return head;
        }

        node temp = head;

        // Traverse to the required position
        for (int i = 0; i < pos; i++) {

            if (temp == null) {
                System.out.println("Invalid Position");
                return head;
            }

            temp = temp.next;
        }

        // If position is greater than list length
        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        // Update the node value
        temp.data = val;

        return head;
    }

    // Display the linked list
    public static void displaylist(node head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class updatenodeval {

    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before Updating:");
        linkedlist.displaylist(head);

        head = linkedlist.update_(head, 2, 90);

        System.out.println("After Updating:");
        linkedlist.displaylist(head);
    }
}