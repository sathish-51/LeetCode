class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode newhead = reverseList(head.next);
        ListNode t = head.next;
        t.next = head;
        head.next = null;
        return newhead;
    }
}
