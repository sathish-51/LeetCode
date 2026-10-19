public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null)return false;
        if(head.next == head)return true;
        ListNode l1 = head.next;
        ListNode l2 = head;
        while(l1.next!=null &&  l1.next.next!=null )
        {
            if(l1==l2)return true;
            l1 = l1.next.next;
            l2 = l2.next;
        }
        return false;
    }
}
