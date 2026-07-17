package linkedlist;
class node{

    int data;
    node next;
    node(int data){
        this.data=data;
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

public class nodeoflinkedlist {
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(30);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);
        //connect
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.data);
    }
}
