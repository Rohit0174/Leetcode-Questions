/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=null;
        ListNode fast=null;
        int cnt=0;
        boolean check=true;
        while(fast!=null || check){
            check=false;
            if(fast==null){
                fast=head;
                cnt++;
            }else if(cnt!=n+1){
                fast=fast.next;
                cnt++;
            }
            else if(cnt==n+1){
                if(slow==null)
                slow=head;
                else
                    slow=slow.next;
                
                fast=fast.next;
            }
        }
        if(slow==null)
            return head.next;
        slow.next=slow.next.next;
        return head;
    }
}