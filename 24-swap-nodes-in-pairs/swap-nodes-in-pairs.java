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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=head; 
        ListNode after=null;
        ListNode temp=null;
        ListNode curr;
        int x=1;
        while(prev!=null&&prev.next!=null)
        {
            curr=prev.next;
            if(x==1)
            {
                head=curr;
                x++;
            }
            after=prev.next.next;
            curr.next=prev;
            prev.next=after;
            if(temp!=null)
            {
                temp.next=curr;
            }
            temp=prev;
            prev=prev.next;
        }
       return head;
    }
}