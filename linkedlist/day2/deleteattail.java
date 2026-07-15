package linkedlist.day2;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class deleteattail {
    public static void main(String[] args) {
        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

    }
}
