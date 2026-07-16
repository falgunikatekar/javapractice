package linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

class linkedlist {

    public static node deletehead(node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        return head.next;
    }

    public static void displaylist(node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class deleteathead {

    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before deleting:");
        linkedlist.displaylist(head);

        head = linkedlist.deletehead(head);

        System.out.println("After deleting:");
        linkedlist.displaylist(head);
    }
}