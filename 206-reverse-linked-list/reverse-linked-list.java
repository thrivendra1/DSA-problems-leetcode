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
    public ListNode reverseList(ListNode head) {
        
        // Apporach 1

    /*    ArrayList<Integer> arraylist=new ArrayList<>();
        // ListNode<Integer> newlist=new ListNode<>();

        ListNode temp=head;
        while(temp!=null)
        {
            arraylist.add(temp.val);
            temp=temp.next;
        }

        //creating new linkedlist class
        ListNode newhead=null;
        ListNode current=null;

        for(int i=arraylist.size()-1;i>=0;i--)
        {
            ListNode newnode=new ListNode(arraylist.get(i));

            if(newhead==null)
            {
                newhead=newnode;
                current=newnode;
            }
            else
            {
                current.next=newnode;
                current=newnode;
            }
        }

        return newhead;
        */

        // Apporach 2
        ListNode newhead=null;

        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=newhead;
            newhead=head;
            head=temp;
        }
        return newhead;
    }
}