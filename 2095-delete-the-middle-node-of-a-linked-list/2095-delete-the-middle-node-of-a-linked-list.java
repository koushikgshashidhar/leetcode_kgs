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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next==null)
            return null;
        
        ListNode tortise=head;
        ListNode rabbit=head;
        
        while(rabbit.next!=null  && rabbit.next.next!=null)
        {
            tortise=tortise.next;
            rabbit=rabbit.next.next;
            
        }
        
        if(rabbit.next!=null)
        {
            tortise.next=tortise.next.next;
        }
        else
        {
        tortise.val=tortise.next.val;
        tortise.next=tortise.next.next;
        }
        return head;
        
    }
}