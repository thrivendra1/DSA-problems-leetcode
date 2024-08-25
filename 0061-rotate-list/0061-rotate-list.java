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
    static public ListNode rotateRight(ListNode head, int k)
    {
        //Apporach-2

        if(head==null || k==0) return head;

        // finding tail
        ListNode tail=head;
        int length=1;
        while(tail.next!=null)
        {
            length++;
            tail=tail.next;
        }

        if(k%length==0) return head;
        k=k%length;

        tail.next=head;
        ListNode newlastNode=findNthNode(head,length-k);

        head=newlastNode.next;
        newlastNode.next=null;
        return head;

    }

   static public ListNode findNthNode(ListNode head,int k)
    {
        int count=1;
        while(head!=null)
        {
            if(count==k)
            {
                return head;
            }
            count++;
            head=head.next;
        }
        return head;
    }
    /*  Apporach-1
    static public ListNode rotateRight(ListNode head, int k)
    {
        // 
        if(head==null || head.next==null)
        {
            return head;
        }
        while (k>0)
        {
            k--;
            ListNode tail=findtail(head);

            // finding tail previous number
            ListNode temp=tailprevious(head);
            

            tail.next=head;
            head=tail;
            temp.next=null;


        }
        return head;

    }

    public static ListNode tailprevious(ListNode head)
    {
        ListNode temp=head;
        while (temp.next.next!=null)
            {
                temp=temp.next;
            }
            return temp;
    }

    private static ListNode findtail(ListNode head)
    {
        while (head.next!=null)
        {
            head=head.next;
        }

        return head;
    }
    */
}