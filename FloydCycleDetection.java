class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    // Display Linked List (Use only if there is no loop)
    public static void displaylist(node head) {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Floyd's Cycle Detection Algorithm
    public static boolean detectLoop(node head) {

        if (head == null) {
            return false;
        }

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;           // Move one step
            fast = fast.next.next;      // Move two steps

            if (slow == fast) {
                return true;            // Loop found
            }
        }

        return false;                   // No loop
    }
}

public class FloydCycleDetection {

    public static void main(String[] args) {

        // Creating nodes
        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);

        // Connecting nodes
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Display before creating loop
        System.out.println("Linked List:");
        linkedlist.displaylist(head);

        // Uncomment the next line to create a loop
        // e.next = c;

        // Detect loop
        if (linkedlist.detectLoop(head)) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("Loop Not Detected");
        }
    }
}