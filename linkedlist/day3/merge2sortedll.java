package linkedlist.day3;
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
    public static int merge(node h1,node h2){
        node i=h1;
        node j=h2;
        node dummy=new node(-1);
        node k=dummy;
        while(i!=null && j!=null){
            if(i.data<j.data){
                k =new node(h1.data);
                k.next=i;
                i=i.next;
            }
            else {
                k=new node(h2.data);
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
            
        return dummy.next;
    }
}
public class merge2sortedll {
    public static void main(String[] args) {
        node head1 = new node(10);
        node b1 = new node(30);
        node c1 = new node(40);
        node d1 = new node(60);
        

        head1.next = b1;
        b1.next = c1;
        c1.next = d1;
       

        node head2 = new node(20);
        node b2 = new node(50);
        node c2 = new node(70);
        node d2 = new node(80);
        node e2=new node(90);
        node f2=new node(105);

        head2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next=e2;
        e2.next=f2;
        linkedlist.merge(head1, head2);
    }
}
