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
        
        if(head==null || head.next==null) return true;

        // step1: find the middle node
        ListNode middleNode=findmiddlenode(head);
        

        // /step 2 -> reverse the second half linkedlist

        ListNode prev=null;
        ListNode current=middleNode;
        ListNode next;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        // step3 compare the two halfs

        ListNode left=head;
        ListNode right=prev;

        while(left!=null && right!=null)
        {
            if(left.val!=right.val) return false;

            left=left.next;
            right=right.next;
        }

        return true;
    }


    public static ListNode findmiddlenode(ListNode head)
    {
        ListNode ans;
        ListNode temp=head;

        int size=0;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        
        ListNode temp1=head;
        ListNode temp2=head;

        if(size/2==0)
        {
           
            size=size/2;
            while(temp1!=null && size>0)
            {
                size--;
                temp1=temp1.next;
            }
            ans=temp1;

        }
        else
        {
            size=(size/2)+1;

            while(temp2!=null)
            {
                size--;
                if(size<=0)
                {
                    break;
                }
                temp2=temp2.next;
            }
            ans=temp2;
        }

        return ans;

    }
}