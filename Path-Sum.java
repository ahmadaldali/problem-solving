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
    public boolean isFound(TreeNode root, int totalSum, int targetSum) {
        if (root == null) return false;

        totalSum += root.val;
        
        if (root.left == null && root.right == null) return totalSum == targetSum;
        if (isFound(root.left, totalSum, targetSum)) return true;

        return isFound(root.right, totalSum, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isFound(root, 0, targetSum);
    }
}
// Time: O(n) - space: O(h)
