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
    public ListNode deleteMiddle(ListNode head) 
    {
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
        int middleindex=count/2;
        // temp=head;
        // for(int i=0;i<count;i++)
        // {
        //     if(i==middleindex)
        //     {
        //         break;
        //     }
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        ListNode kNode=head;
        while(kNode!=null)
        {
            middleindex--;
            if(middleindex<1)
            {
                break;
            }
            kNode=kNode.next;
        }
        System.out.println(kNode.val);
        kNode.next=kNode.next.next;
        
        return head;
    }
}