package graph;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
    }

    public static int max(node head) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = max(head.left);
        int rightMax = max(head.right);

        return Math.max(head.data, Math.max(leftMax, rightMax));
    }
}

public class maxval {
    public static void main(String[] args) {
        node a = new node(8);
        node b = new node(5);
        node c = new node(6);
        node d = new node(8);
        node e = new node(9);
        node f = new node(15);

        // Connection
        a.right = b;
        a.left = c;
        c.right = d;
        d.right = e;
        d.left = f;

        System.out.println(node.max(a));
    }
}