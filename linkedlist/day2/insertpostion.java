package linkedlist.day2;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    public static node insertpos(node head, int val, int pos) {

        if (pos < 0) {
            System.out.println("Invalid Position");
            return head;
        }

        // Insert at beginning
        if (pos == 0) {
            node t = new node(val);
            t.next = head;
            return t;
        }

        node temp = head;

        // Move to the node before the required position
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return head;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        node t = new node(val);
        t.next = temp.next;
        temp.next = t;

        return head;
    }

    public static void displaylist(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class insertpostion {

    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before Insertion:");
        linkedlist.displaylist(head);

        head = linkedlist.insertpos(head, 34, 3);

        System.out.println("After Insertion:");
        linkedlist.displaylist(head);
    }
}