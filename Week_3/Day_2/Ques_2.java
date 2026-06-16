class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverseList(head);
        if(n==1){
            head= head.next;
            return reverseList(head);
        }
        ListNode temp = head;
        for(int i = 1 ; i < n-1 ; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return reverseList(head);
    }

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