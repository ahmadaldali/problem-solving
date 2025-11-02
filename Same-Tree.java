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
    public void fillQueue(TreeNode root, Queue<Integer> nodes) {
        if (root == null) {
            nodes.offer(-100000);
            return;
        }

        nodes.offer(root.val);
        fillQueue(root.left, nodes);
        fillQueue(root.right, nodes);
    }

    public boolean sameTree(TreeNode q, Queue<Integer> pNodes) {
        if (pNodes.isEmpty()) {
            return false;
        }

        int head = pNodes.poll();
        if (q == null) {
            return head == -100000;
        }

        boolean sameNode = (head == q.val);
        boolean left = sameNode && sameTree(q.left, pNodes);
        return left && sameTree(q.right, pNodes);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<Integer> pNodes = new LinkedList<>();
        fillQueue(p, pNodes);

        return sameTree(q, pNodes);
    }
}
