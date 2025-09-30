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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;

        //we are using merge sort
            // merge sort step was you have slipt the array to end for each one have only one digit like that
            

        // step -1 Find the middleNode 
        ListNode middleNode=findmiddleNode(head);

        //step 2 -// make the remmaing List to slipt
        ListNode left=head;
        ListNode right=middleNode.next;
        middleNode.next=null;

        // calling the function till the base case satafised

        left=sortList(left);
        right=sortList(right);

        // step -3 merging the two numbers
        return merge(left,right);

    }

    public ListNode findmiddleNode(ListNode head)
    {
        //using slow & fast pointer pattern

        ListNode slow=head;
        ListNode fast=head.next; //we use head.next values bacuse if we use head it give after the middle node so we using this

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                temp.next=left;
                temp=left;
                left=left.next;
            }
            else 
            {
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }

        if(left!=null)
        {
            temp.next=left;
        }
        if(right!=null)
        {
            temp.next=right;
        }

        return dummy.next;
    }
}