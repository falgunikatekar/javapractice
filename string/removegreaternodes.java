/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {

        ListNode next = curr.next;

        curr.next = prev;

        prev = curr;

        curr = next;
    }

    return prev;
}
    public ListNode removeNodes(ListNode head) {
        Stack <Integer> st=new Stack<>();
        Stack <Integer> st1=new Stack<>();
        head = reverse(head);

int max = head.val;
ListNode curr = head;

while (curr != null && curr.next != null) {

    if (curr.next.val < max) {
        curr.next = curr.next.next;   // Delete node
    } else {
        max = curr.next.val;          // Update maximum
        curr = curr.next;             // Move forward
    }
}

head = reverse(head);

return head;
    }
}