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
    
}
public class linkedlistdatastructure {
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
    }
}
