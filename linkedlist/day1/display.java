package linkedlist;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class display {
    public static void displaylist(node head){
    while(head !=null){
        System.out.print(head.data+" ");
        head=head.next;
    }
}
    public static void main(String[] args) {
        node a=new node(23);
        node b=new node(34);
        node c=new node(223);
        node d=new node(334);
        node e=new node(273);
        node f=new node(134);
        a.next=b;b.next=c;
        c.next=d;d.next=e;
        e.next=f;
        displaylist(a);
    }
}
