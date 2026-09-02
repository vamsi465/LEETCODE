/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head;

        while (temp != null) {
            Node copy = new Node(temp.val);

            copy.next = temp.next;
            temp.next = copy;

            temp = copy.next;
        }
        temp = head;

        while (temp != null) {

            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }
        Node dummy = new Node(0);
        Node copyTemp = dummy;

        temp = head;

        while (temp != null) {

            copyTemp.next = temp.next;
            copyTemp = copyTemp.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}