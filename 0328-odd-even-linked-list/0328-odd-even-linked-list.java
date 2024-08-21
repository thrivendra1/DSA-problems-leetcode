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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode temp=head;
        ArrayList <Integer> oddarr=new ArrayList<>();
        ArrayList <Integer> evenarr=new ArrayList<>();
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count%2!=0)
            {
                oddarr.add(temp.val);
            }
            else if(count%2==0)
            {
                evenarr.add(temp.val);
            }
            temp=temp.next;
        }

        //adding odd index in the Node
            temp=head;
        for(int i=0;i<oddarr.size();i++)
        {
            temp.val=oddarr.get(i);
            temp=temp.next;

        }
        //adding even index in the Node
        for(int i=0;i<evenarr.size();i++)
        {
            temp.val=evenarr.get(i);
            temp=temp.next;

        }
        

        return head;
        
    }
}