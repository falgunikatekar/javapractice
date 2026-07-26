package graph;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }

public static int add(node head){
    if(head==null){
        return 0;
    }
    return head.data+add(head.right)+add(head.left);
}
}
public class sum {
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
        System.out.println(node.add(a));
    }
}
