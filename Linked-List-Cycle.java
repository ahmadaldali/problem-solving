/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public boolean hasCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoSteps = head;

        while(oneStep != null && twoSteps != null) {
            oneStep = oneStep.next;
            
            if (twoSteps.next == null) return false;
            twoSteps = twoSteps.next.next;

            if (oneStep == twoSteps) return true;
        }

        return false;
    }

    // Time: O(n) - space: O(1)

    /**
    * O(n)
    public boolean hasCycle(ListNode head) {
        HashSet<Integer> visitedNodes = new HashSet();
        while(head != null) {
            if (visitedNodes.contains(head.val)) return true;

            visitedNodes.add(head.val);
            head = head.next;
        }

        return false;
    }
    */
}
