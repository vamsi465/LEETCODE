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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int cnt=1;
        ListNode first=head;
        ListNode temp=first;
        while(first!=null)
        {
             if(cnt==left)
            {
                 ListNode prev=null;
                 ListNode curr=first;
                 while(curr!=null&&cnt<=right)
                {
                   ListNode after=curr.next;
                   curr.next=prev;
                   prev=curr;
                   curr=after;
                   cnt++;
                }
                if(left==1)
                {
                    temp=prev;
                    head=prev;
                    first.next=curr;
                    return head;
                }else
                {
                    temp.next=prev;
                    first.next=curr;
                }
                
                return head;
            }
            cnt++;
            temp=first;
            first=temp.next;
        }
        return head;
    }
}