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
        ListNode origin = head;
        Stack<Integer> reversed = new Stack<>();
        int i=1;

        while (head != null) {
            if (i>=left && i<=right) {
                reversed.push(head.val);
            }

            head = head.next;
            i++;
        }
        
        i=1;
        ListNode dummy = new ListNode(0);
        dummy.next = origin;
        while (origin != null) {
            if (i>=left && i<=right) {
                origin.val = reversed.pop();
            }

            origin = origin.next;
            i++;
        }

        return dummy.next;
    }
}

// Time and space : O(n)
