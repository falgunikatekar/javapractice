package linkedlist.day2;
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
    public static void display(node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
    public static node duplicate(node head){
        node i=head;
        node j=head;
        while(j!=null){
            if(i.data==j.data){
                j=j.next;
        }else{
        i.next=j;   
        i=j;
        }
        
    }
    return head;
    //i.next=j;    
    
    }
}
public class duplicate {
    public static void main(String[] args) {
        node head = new node(10);
        node a = new node(10);
        node b = new node(20);
        node c = new node(20);
        node d = new node(30);
        node e = new node(40);
        node f = new node(40);
        node g = new node(50);

// Linking the nodes
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        linkedlist.display(head);
        linkedlist.duplicate(head);linkedlist.display(head);
    }
}
