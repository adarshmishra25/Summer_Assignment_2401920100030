class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nextNode = null;

        if (pres != null) {
            nextNode = pres.next;
        }

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = nextNode;

            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }
        return prev;
    }
}