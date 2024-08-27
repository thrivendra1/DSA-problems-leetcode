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
    public ListNode removeElements(ListNode head, int val) 
    {
    //     ListNode temp=head;
    //     while(temp!=null)
    //     {
    //         if(temp.next.val==val && temp.next!=null)
    //         {
    //             temp.next=temp.next.next;
    //         }
    //         temp=temp.next;
    //     }
    //     return head;
        
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(head!=null)
        {
            if(head.val!=val)
            {
                ListNode data=new ListNode(head.val);
                temp.next=data;
                temp=temp.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}