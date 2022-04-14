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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre=head;
        ListNode run=head;
        while(pre!=null){
            while(run!=null && run.val==pre.val){
                run=run.next;
            }
            pre.next=run;
            pre=run;
        }
        return head;
    }
}