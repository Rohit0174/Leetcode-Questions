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
        ListNode previous=head;
        ListNode runner=head;
        while(previous!=null){
            while(runner!=null && runner.val==previous.val  ){
                runner=runner.next;
            }
            previous.next=runner;
            previous=previous.next;
        }
        return head;
    }
}