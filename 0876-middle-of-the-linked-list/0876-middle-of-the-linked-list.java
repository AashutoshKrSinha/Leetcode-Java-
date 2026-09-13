class Solution {
    public ListNode middleNode(ListNode head) {
        /*
        int count = 0;

        for ( ListNode curr = head; curr != null; curr= curr.next){
            count++;
        }

        ListNode curr = head;

        for(int i=0; i<count/2;i++){
            curr = curr.next;
        }

        return curr;
        */
        if(head == null){
            return head;
        }
        ListNode slow =head;
        for(ListNode fast=head; fast != null && fast.next != null;fast=fast.next.next){
            slow = slow.next;
            //fast = fast.next.next;
        }
        return slow;
    }
}