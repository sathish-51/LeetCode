class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        if(head.next==null && n==1)return null;
        ListNode l1 = head;
        ListNode l2 = head;
        int c=0,cp=1;
        while(head!=null){
        head = head.next;
        c++;
        }
        if((c-n)==0) return l2.next;
        while(cp<(c-n)){
            l1 = l1.next;
            cp++;
        }
        l1.next = l1.next.next;
        return l2;
    }
}
