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
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int size=0;

        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }

        size=size/2;

        ListNode anothertemp=head;

        while(anothertemp!=null && size>0)
        {
            size--;
            if(size==0) break;
            anothertemp=anothertemp.next;
        }

        anothertemp.next=anothertemp.next.next;
        return head;
    }
}