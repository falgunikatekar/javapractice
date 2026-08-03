class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    // Update node value at a given position (0-based indexing)
    public static int occr(node head, int val) {
        int count=0;
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        }
        node temp = head;
        while(temp!=null){
            if(temp.data==val){
                count+=1;
            }temp=temp.next;
        }return count;
    }

    // Display the linked list
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

public class occuranceofele {
    public static void main(String[] args) {

        node head = new node(10);
        node b = new node(20);
        node c = new node(20);
        node d = new node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before Updating:");
        linkedlist.displaylist(head);

        System.out.println(linkedlist.occr(head, 20));

       
    }   
}
