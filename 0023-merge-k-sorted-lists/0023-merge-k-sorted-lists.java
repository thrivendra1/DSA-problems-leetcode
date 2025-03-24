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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> q=new PriorityQueue<>();

        for(ListNode node:lists)
        {
            while(node!=null)
            {
                q.add(node.val);
                node=node.next;
            }
        }

        System.out.println(q);
        ListNode dummy=new ListNode(0);
       ListNode current=dummy;
       
       while(!q.isEmpty())
       {
            current.next = new ListNode(q.poll());
            current = current.next;
       }
       return dummy.next;
        
    }
}