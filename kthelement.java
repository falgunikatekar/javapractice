public public static int nthFromEnd(node head, int n) {

    if (head == null) {
        System.out.println("List is Empty");
        return -1;
    }

    if (n <= 0) {
        System.out.println("Invalid N");
        return -1;
    }

    node first = head;
    node second = head;

    // Move first pointer n steps ahead
    for (int i = 0; i < n; i++) {

        if (first == null) {
            System.out.println("N is greater than list length");
            return -1;
        }

        first = first.next;
    }

    // Move both pointers
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    return second.data;
} 