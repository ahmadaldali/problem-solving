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
    int maxSoFar = Integer.MIN_VALUE;

    int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        int fullPath = left + node.val + right;
        int withLeftOnly = left + node.val;
        int withRightOnly = node.val + right;

        maxSoFar = Math.max(
                    Math.max(
                            Math.max(maxSoFar, fullPath), 
                        withLeftOnly),
                withRightOnly);

        return Math.max(0,Math.max(withRightOnly, withLeftOnly));
    }

    public int maxPathSum(TreeNode root) {
        dfs(root);

        return maxSoFar;
    }
}
