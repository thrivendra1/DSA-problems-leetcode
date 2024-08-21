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
        if(head==null || head.next==null)
        {
            return null;
        }
       
       
       /*
    //    Apporach-1
        ListNode temp=head;

        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }

        if(count==n)
        {
            head=head.next;
            return head;
        }

        int num=count-n;
        ListNode kNode=head;
        while(kNode!=null)
        {
            num--;
            if(num==0)
            {
                break;   
            }
            kNode=kNode.next;
        }
        kNode.next=kNode.next.next;
        
        return head;
        */

        // Apporach-2
        // we are taking two Node 

        ListNode fast=head;
        ListNode slow=head;

        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            return head.next;
        }

        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;

        
    }
}