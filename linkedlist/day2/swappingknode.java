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
    public static void display (node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static node swap(node temp,int k){
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        return temp;    
    }

    public static int count(node n){
        int size =0;
        while(n!=null){
            size+=1;
            n=n.next;
        }
        return size;
    }
    public static node kth (node n,int k){
        int a=count(n);
        int d=a - k;
        for(int j=0;j<d;j++){
            n=n.next;
        }
        return n;
    }
    public static void fin(node temp1,int k){
        node n1=swap(temp1,k);
        node n2=kth(temp1,k);
        int t=n1.data;
        n1.data=n2.data;
        n2.data=t;
    }    
    
}
public class swappingknode {
    public static void main(String[] args) {
        node head=new node(1);
        node a=new node(2);
        node b=new node(3);
        node c=new node (4);
        node d=new node(5);
        node e=new node(6);
        node f=new node(7);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        linkedlist.fin(head,3);
        linkedlist.display(head);
    }

    }

