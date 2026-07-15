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
    static void addattail(node temp,int val){
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new node(val);
    }
    static void display(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class practiceattail {
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        linkedlist.addattail(a,34);
        linkedlist.display(a);
    }   
}
