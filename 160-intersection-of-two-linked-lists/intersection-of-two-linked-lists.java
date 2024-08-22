/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        /*
        //Apporach -1
        while(headB!=null)
        {
            ListNode temp=headA;
            while(temp!=null)
            {
                if(temp==headB) return headB;

                temp=temp.next;
            }
            headB=headB.next;

        }
        return null;
        */

        // Apporach-2
        // / using hashset

        HashSet<ListNode> hash=new HashSet<>();

        while(headA!=null)
        {
            hash.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(hash.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}