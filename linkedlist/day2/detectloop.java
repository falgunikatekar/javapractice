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
 public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }