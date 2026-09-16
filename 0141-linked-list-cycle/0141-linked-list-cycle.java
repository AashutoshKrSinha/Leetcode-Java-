public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        /*for(ListNode fast = head; fast != null && fast.next != null ;){
            slow = slow.next;
            fast = fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
        */
        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {
                return true;          // cycle detected
            }
        }

        return false; // no cycle
    }
}