package linkedlist;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
class linkedlist{
    node head;
    node tail;
    public static node inserthead(node head,int val){
        node newhead=new node(val);
        newhead.next = head;
        return newhead;
    }
    public static void display(node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
public class insertathead {
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        a=linkedlist.inserthead(a,78);
        linkedlist.display(a);
    }    
}
