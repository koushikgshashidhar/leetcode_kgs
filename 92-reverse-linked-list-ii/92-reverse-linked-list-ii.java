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
    public ListNode reverseBetween(ListNode head, int left, int right) {

          int count=1;
        ListNode cur=head;
        ListNode prev=null;
      
        while(count!=left)
        {
            prev=cur;
            cur=cur.next;
            count++;
        }
        
        ListNode rev=cur;
        while(count!=right)
        {
            cur=cur.next;
            count++;   
        }
        ListNode rest=cur.next;
        cur.next=null;
        
        ListNode newhead=reverse(rev);
        if(prev!=null)
        prev.next=newhead;
        
        cur=newhead;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        
        cur.next=rest;
        
        if(left==1)
            return newhead;
        else
            return head;
        
    }
    
    ListNode reverse(ListNode head)
    {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;

         next=head.next;
        
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