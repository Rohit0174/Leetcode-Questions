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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        int cnt=0;
        ListNode first=head;
        while(cnt!=k){
            fast=fast.next;
            cnt++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        int i=1;
        while(i!=k){
            first=first.next;
            i++;
        }
        int temp=first.val;
        first.val=slow.val;
        slow.val=temp;
        return head;
    }
}