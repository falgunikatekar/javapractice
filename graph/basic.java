package graph;


class node{
    int data;
    node right;
    node left;
    node(int data){
        this.data=data;
    }
    public static void display(node root){
        if (root == null) {   // Base case
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);

    }

}
public class basic {
    public static void main(String[] args) {
        node a=new node(8);
        node b=new node(5);
        node c=new node(6);
        node d=new node(8);
        node e=new node(9);
        node f=new node(15);
        //connecrtion
        a.right=b;
        a.left=c;
        c.right=d;
        d.right=e;
        d.left=f;
        node.display(a);


    }
}
