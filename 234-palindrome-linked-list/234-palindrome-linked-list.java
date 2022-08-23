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
        
        
        ListNode first=head;
        ListNode second=head;
        if(head==null || head.next==null)return true;
        
        
        while(second.next!=null && second.next.next!=null)
        {
            first=first.next;
            second=second.next.next;    
        }
        
        ListNode mid=first.next;
        first.next=null;
        
        first=null;
        second=mid;
        ListNode third=mid.next;
        
         while(second!=null)
        {
            
             second.next=first;
             first=second;
             second=third;
             
             if(second!=null)
             third=second.next;
            
        }
        
        
        ListNode last=first;
         first=head;
        while(first!=null && last!=null)
        {
            if(first.val!=last.val)
                return false;
            
            first=first.next;
             last=last.next;
        }
        
        return true;
    }
}