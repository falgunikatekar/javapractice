package graph;
class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
    }
    public static int levelprint(node head){
        if(head==null){
            return 0;
        }
        return 1+Math.max(levelprint(head.left),levelprint(head.right));
    }
}
public class level {
   public static void main(String[] args) {
        node a = new node(8);
        node b = new node(5);
        node c = new node(6);
        node d = new node(8);
        node e = new node(9);
        node f = new node(15);
        node g=new node(9);

        // Connection
        a.right = b;
        b.right = c;
        c.right = d;
        d.right = e;
        d.left = f;
        f.right=g;
        
        System.out.println(node.levelprint(a));
   }
}
