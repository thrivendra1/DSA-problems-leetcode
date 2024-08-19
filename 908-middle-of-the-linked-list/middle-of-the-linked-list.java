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
    static public ListNode middleNode(ListNode head) {
            double count=0;
            ListNode temp=head;

            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            int result=0;

            if(count%2==0)
            {
                count=count/2;
                result=(int)count+1;
            }

            else
            {
                //    double result=count/2;
                //     System.out.println(result);
                //     count=(int)Math.ceil(result);

                count=count/2;
                result=(int)count+1;
            }

            temp=head;
            int num=0;
            while(temp!=null)
            {
                num++;
                if(num>=result)
                {
                    break;

                }

                temp=temp.next;

            }

            return temp;
        }
}