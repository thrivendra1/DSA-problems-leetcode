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
    public ListNode sortList(ListNode head) 
    {
        /*
        // Apporach -1 we used a arraylist and sort the arrayList and add the values into linkedlist
        ArrayList<Integer> arr=new ArrayList<>();

        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
            count++;
        }
        
        Collections.sort(arr);

        temp=head;
        for(int i=0;i<arr.size();i++)
        {
            temp.val=arr.get(i);
            temp=temp.next;
        }
        
        return head;
        */

        // Apporach-2 we are using merger sort alogrthim

        if(head==null || head.next==null)
        {
            return head;
        }

        // merger sort 

        ListNode middle=findmid(head);

        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;

        left=sortList(left);
        right=sortList(right);

        return merge(left,right);
        
    }

    // finding middle of the linkedlist

    public ListNode findmid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next; //we get out middle here

            fast=fast.next.next;
        }
        return slow;
    }

    //  we are mergering the two Nodes

    public ListNode merge(ListNode left,ListNode right)
    {
            ListNode dummy=new ListNode (-1); //  we are creating a dummy Node to store the sort value
            ListNode temp=dummy;
            while(left!=null && right!=null)
            {
                if(left.val<right.val)
                {
                    temp.next=left;
                    temp=left;
                    left=left.next;
                }
                else
                {
                    temp.next=right;
                    temp=right;
                    right=right.next;
                }
            }

            // if left have 3 Node and right was 2 Node 
            // the left last node was remaing that why we use this if else 

            if(left!=null)  // we checking left!=null
            {
                temp.next=left;
            } 
            else if(right!=null)
            {
                temp.next=right;
            }

        return dummy.next;

    }
}