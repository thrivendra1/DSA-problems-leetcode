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
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        // creating dummy Node
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode headA=l1;
        ListNode headB=l2;
        
        int carry=0;
        while(headA!=null || headB!=null || carry==1)
        {
            int sum=0;
            if(headA!=null)
            {
                sum=sum+headA.val;
                headA=headA.next;
            }
            if(headB!=null)
            {
                sum=sum+headB.val;
                headB=headB.next;
            }
            
            sum+=carry;
            carry=sum/10;
            ListNode value=new ListNode(sum%10);
            temp.next=value;
            temp=value;
            
            
        }
        return dummy.next;
        
    }
}