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

 import java.util.ArrayList;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) return head;

        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int len = values.size();
        k = k%len;
        if (k == 0 || len==1) return head;

        current = (new ListNode()).next;
        ListNode temp = new ListNode();
        for (int i=len-k -1;i>=0;i--) {
            temp = current;
            current = new ListNode(values.get(i));
            current.next = temp;
        }

        for (int i=len-1;i>=len-k;i--) {
            temp = current;
            current = new ListNode(values.get(i));
            current.next = temp;
        }
        
        return current;
    }
}
