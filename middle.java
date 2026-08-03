class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
  
}
class linkedlist{
    public static void displaylist(node head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static int midd(node head){
        node slow=head;
        node fast=head;
        if(head==null){
            System.out.println("null");
            return 0;
         }
         while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
         }return slow.data;

    }

}
public class middle {
    public static void main(String[] args) {
        node head = new node(10);
        node b = new node(20);
        node c = new node(120);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before Updating:");
        linkedlist.displaylist(head);

        System.out.println(linkedlist.midd(head));
    }
}
 
