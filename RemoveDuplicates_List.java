class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        if(head.next==null) return head;
        ListNode l = head;
        while(head!= null && head.next!=null) {
            if(head.val==head.next.val)head.next=head.next.next;
           if(head.next!=null && head.val!=head.next.val) head=head.next;
        }
        return l;
    }

}
