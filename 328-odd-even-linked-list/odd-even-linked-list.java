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

        /* question expantion
        this question doesn't focuns of data was even or odd or -ve or +ve , they foucus on index only 
        first you have to store odd inedx values then even index vlaues 
        TC-o(n)
        

        Apporch-1
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
        */
        if(head==null || head.next==null)
            {
                return head;
            }

        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;
       
        while(even!=null && even.next!=null)
        {
            
            odd.next=odd.next.next;
            
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
            
        }
        odd.next=evenhead;
        return head;
        
    }
}