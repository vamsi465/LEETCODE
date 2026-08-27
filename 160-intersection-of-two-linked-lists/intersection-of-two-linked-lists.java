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
    int findLength(ListNode temp)
    {
        int cnt=1;
         while(temp.next!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int len1=1;
        int len2=1;
        len1=findLength(temp1);
        len2=findLength(temp2);
        int skipA=1;
        int skipB=1;
        
        if (len1 > len2) {
            skipA = len1 - len2;

           for (int i = 0; i < skipA; i++) {
              temp1 = temp1.next;
            }
        } 
        else {
           skipB = len2 - len1;

          for (int i = 0; i < skipB; i++) {
             temp2 = temp2.next;
            }
        }

     while (temp1 != temp2) {
      temp1 = temp1.next;
      temp2 = temp2.next;
     }
    return temp1;
  }
}