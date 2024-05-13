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
    
    public ListNode findmidNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next; //+1
            fast=fast.next.next; // +2
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head==null && head.next==null)
        {
            return true;
        }
        // STEP 1: Find midnode
        
        ListNode midNode=findmidNode(head);
        
        // STEP 2: Reverser 2nd half
        
        ListNode prev=null;
        ListNode current=midNode;
        ListNode next;
        
        
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            
            prev=current;
            current=next;
        }
        
                    // System.out.print(current.val);

        ListNode right=prev;
        ListNode left=head;
        
        //Step 3: check it's true or false
        
        while(right!=null)
        {
            if(left.val!=right.val)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
}