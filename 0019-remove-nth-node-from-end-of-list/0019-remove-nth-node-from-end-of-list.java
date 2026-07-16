class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;

        // Count nodes
        for (ListNode curr = head; curr != null; curr = curr.next) {
            count++;
        }

        // First node delete karna ho
        if (count == n) {
            return head.next;
        }

        ListNode curr = head;

        // Delete hone wale node se ek pehle tak jao
        for (int i = 1; i < count - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}