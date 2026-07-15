package linkedlist.day2;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

class linkedlist {

    public static void search(node head, int val) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (head != null) {

            if (head.data == val) {
                System.out.println("Element Present");
                return;
            }

            head = head.next;
        }

        System.out.println("Element Not Present");
    }

    public static void display(node head) {

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}

public class search {

    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        linkedlist.display(head);
        linkedlist.search(head, 30);
    }
}