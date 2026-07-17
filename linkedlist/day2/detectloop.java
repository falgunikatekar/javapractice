package linkedlist.day2;

public class detectloop {
    public static void main(String[] args) {
        public static boolean detectlooop(node head){
            node slow=head;
            node fast=head;
            while(fast!=null && slow !=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    return true;
                }
                return false;
            }
        }
    }
}
