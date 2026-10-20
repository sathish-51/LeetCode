class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node acts as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Traverse both lists and attach the smaller node
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move tail forward
        }

        // Attach whatever is left from either list
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        // The merged list starts after the dummy node
        return dummy.next;
    }
}
