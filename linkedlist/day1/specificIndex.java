package linkedlist;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class specificIndex {
    public static int get(node temp,int index){
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public static void displayRec(node temp) {
    if (temp == null) {
        return;    // Base case
    }

    System.out.print(temp.data + " ");
    displayRec(temp.next);   // Recursive call
}
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(get(a,2));
        displayRec((a));
    }
}
