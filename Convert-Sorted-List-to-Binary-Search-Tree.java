import java.util.ArrayList;
import java.util.List;

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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> sortedListToArrayList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values;
    }

    public TreeNode arrayListToBST(List<Integer> values) {
        if (values.isEmpty()) {
            return null;
        }

        int rootPosition = values.size() / 2;
        TreeNode root = new TreeNode(values.get(rootPosition));

        root.left = arrayListToBST(values.subList(0, rootPosition));
        root.right = arrayListToBST(values.subList(rootPosition + 1, values.size()));

        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        return arrayListToBST(sortedListToArrayList(head));
    }
}
