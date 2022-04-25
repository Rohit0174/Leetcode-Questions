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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=slow;
        
        // while(head!=null){
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        ListNode rev = reverse(head1);
        while(rev!=null){
            if(head.val!=rev.val)return false;
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        while(current!=null){
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        return previous;
    }
}
