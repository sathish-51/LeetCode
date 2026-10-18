class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)return head;
        if(head.next!=null && head.val==val)
            return removeElements(head.next,val);
        else if(head.val==val)
            return null;
        head.next=removeElements(head.next,val);
        return head;
    }
}
