package linkedlist;

    class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }}
    class linkedlist{
        node head;
        node tail;
        public static void addtail(node temp, int val) {
            while (temp.next != null) {
                temp = temp.next;
    }
            temp.next = new node(val);
}
        public static void display(node head) {

            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
        }
    }
}
    
public class addingAtTail {
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        linkedlist.addtail(a, 23);
        linkedlist.display(a);

    }
}


