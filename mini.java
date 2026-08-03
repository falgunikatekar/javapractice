class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
class linkedlist{
    public static int minimum(node head){
        if(head==null){
            System.out.println("empty");
            return 0;
        }
        int min=head.data;
        while(head!=null){
            if(head.data<min){
                min=head.data;
            }head=head.next;
        }return min;
    }
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

}
public class mini {
    public static void main(String[] args) {
        node head = new node(10);
        node b = new node(20);
        node c = new node(0);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before Updating:");
        linkedlist.displaylist(head);

        System.out.println(linkedlist.minimum(head));
    }
}
