public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode S = head;
        ListNode F = head;
        while(F != null && F.next != null){
            F = F.next.next;
            S = S.next;
            if(F==S) return true;    
        }
        return false;

    }
}