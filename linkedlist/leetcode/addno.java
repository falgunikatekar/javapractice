package linkedlist.leetcode;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class addno {

    public static Node add(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;

        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {

            int sum = carry;//reset karne

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;

            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // First list: 2 -> 4 -> 3
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        // Second list: 5 -> 6 -> 4
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node result = add(head1, head2);

        System.out.print("Result: ");
        display(result);
    }
}