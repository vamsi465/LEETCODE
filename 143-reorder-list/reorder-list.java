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

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split
        ListNode second = slow.next;
        slow.next = null;

        // Reverse second half
        ListNode prev = null;

        while (second != null) {
            ListNode after = second.next;
            second.next = prev;
            prev = second;
            second = after;
        }

        // Merge alternately
        ListNode temp = head;

        while (prev != null) {
            ListNode nextTemp = temp.next;
            ListNode nextPrev = prev.next;

            temp.next = prev;
            prev.next = nextTemp;

            temp = nextTemp;
            prev = nextPrev;
        }
    }
}