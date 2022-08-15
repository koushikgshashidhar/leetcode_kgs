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
    public int getDecimalValue(ListNode head) {
        
        ListNode rhead=reverse(head);
        int x=0;
        int res=0;
        while(rhead!=null)
        {
            res+=rhead.val*(1<<x);
            rhead=rhead.next;
            x++;
        }
        return res;
    }
    
    ListNode reverse(ListNode head)
    {
        
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=head.next;
        
        while(cur!=null)
        {
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null)
            next=next.next;
        }
        
        return prev;
    }
}