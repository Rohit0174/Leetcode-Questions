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
        ListNode ans = new ListNode();
        ListNode current = new ListNode();
        if(list1==null)return list2;
        if(list2==null)return list1;
        if(list1.val<list2.val){
            ans.val = list1.val;
            list1=list1.next;
        }else{
            ans.val = list2.val;
            list2=list2.next;
        }
        current=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next = list1;
                list1=list1.next;
            }else{
                current.next = list2;
                list2=list2.next;
            }
            current = current.next;
        }
        while(list1!=null){
             current.next = list1;
                list1=list1.next;
            current = current.next;
        }
        while(list2!=null){
             current.next = list2;
                list2=list2.next;
                        current = current.next;

        }
        return ans;
    }
}