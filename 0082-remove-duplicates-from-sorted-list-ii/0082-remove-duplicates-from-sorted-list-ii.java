class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode cur = head;

        while (cur != null) {

            // check if current is duplicate
            if (cur.next != null && cur.val == cur.next.val) {

                int dup = cur.val;

                // skip all duplicates
                while (cur != null && cur.val == dup) {
                    cur = cur.next;
                }

            } else {
                // unique node → add to new list
                tail.next = cur;
                tail = tail.next;
                cur = cur.next;
            }
        }

        // important: end cut
        tail.next = null;

        return dummy.next;
    }
}