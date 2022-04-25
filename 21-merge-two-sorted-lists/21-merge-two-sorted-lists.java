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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(1);
        ListNode current=head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode temp=new ListNode(list1.val);
                list1=list1.next;
                current.next=temp;
                current=current.next;
            }else{
                  ListNode temp=new ListNode(list2.val);
                list2=list2.next;
                current.next=temp;
                current=current.next;
            }
        }
        while(list1!=null){
             ListNode temp=new ListNode(list1.val);
                list1=list1.next;
                current.next=temp;
                current=current.next;
        }
        while(list2!=null){
             ListNode temp=new ListNode(list2.val);
                list2=list2.next;
                current.next=temp;
                current=current.next;
        }
        return head.next;
    }
}