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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       ListNode tail=head;
       ListNode temp=head;
       ListNode after;
       ListNode nextTemp;
       ListNode nextPrev;
       ListNode prev=null;
       ListNode bs=null;
       while(fast!=null&&fast.next!=null)
       {
         slow=slow.next;
         fast=fast.next.next;
       } 
       ListNode second=slow.next;
       slow.next=bs;
       while(second!=null) {
        after=second.next;
        second.next=prev;
        prev=second;
        second=after;
       }
       while(prev!=null)
       {
        nextTemp=temp.next;
        nextPrev=prev.next;
        temp.next=prev;
        prev.next=nextTemp;
        prev=nextPrev;
        temp=nextTemp;
       }
       if(prev!=null)
       {
        temp.next=prev;
       }
    } 
}