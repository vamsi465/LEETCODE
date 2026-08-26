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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=1;
        while(temp.next!=null) {
            cnt++;
            temp=temp.next;
        }
        int removeAt=cnt-n+1;
        ListNode curr=head;
        ListNode after;
        int cnt2=1;
        ListNode prev=null;
        while(curr!=null)
        {
            after=curr.next;
            if(removeAt==1)
            {
                head=head.next;
                return head;
            }
            else if(cnt2==removeAt) {
               prev.next=after;
               break;
            }
            prev=curr;
            curr=curr.next;
            cnt2++;
        }
        return head;
    }
}