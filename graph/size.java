package graph;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;

    }
    public static int size1(node root){

        if(root==null){
            return 0;
        }
        int leftval=size1(root.left);
        int rightval=size1(root.right);
        return 1+leftval+rightval;
    }
    public static int product(node root){
        if(root==null){
            return 1;
        }
        int rightpro=product(root.right);
        int leftpro=product(root.left);
        return root.data*rightpro*leftpro;

    }
}
public class size {
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
        System.out.println(node.size1(a));
        System.out.println(node.product(a));

    }
    
}
