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
        
    }
}