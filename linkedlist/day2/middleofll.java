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
    
    public static int count(node head){
        int size =0;
        while(head!=null){
            
            size +=1;
            head=head.next;
        }
        return size;
    }
    public static int middle(node head){
        int c=count(head);
        int d=c/2;
        for(int i = 0; i < d; i++){
            head = head.next;
    }

        return head.data;
}
        

    }
    
public class middleofll {
    public static void main(String[] args) {
        node head = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e=new node(35);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next=e;
        System.out.println(linkedlist.middle(head));
    }
}
