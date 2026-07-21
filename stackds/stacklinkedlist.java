package stackds;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class StackLL {
    Node head;

    // Push
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Pop
    public int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    // Peek
    public int peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return head.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class stacklinkedlist {
    public static void main(String[] args) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack:");
        st.display();

        System.out.println("Peek = " + st.peek());

        System.out.println("Pop = " + st.pop());

        System.out.println("After Pop:");
        st.display();
    }
}