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
    public ListNode middleNode(ListNode head) {
        
        ListNode tempNode=head;

        int size_of_LL=0;

        int middlNode=0;

        while(tempNode!=null)
        {
            size_of_LL++;
            tempNode=tempNode.next;
        }
        System.out.println(size_of_LL);

        if(size_of_LL%2==0)
        {
            size_of_LL=size_of_LL/2;
           middlNode= size_of_LL+1;   
        }
        else
        {
           size_of_LL=size_of_LL/2;
            middlNode=size_of_LL+1;   
        }
        System.out.println(middlNode);

       ListNode temp=head;

        int count=0;
        while(temp!=null)
        {
             count++;
            if(count>=middlNode)
            {
                break;
            }
           
            temp=temp.next;
        }

        return temp;

    }
}