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
        
   
        int ln=0;
        ListNode temp=head;
        while(temp!=null)
        {
            ln++;
            temp=temp.next;
        }
            
        ln-=n+1;
         if(ln<0)return head.next;
        temp=head;
        while(ln!=0 && temp!=null)
        {
            temp=temp.next;
            ln--;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
        
        return head;
    }
}