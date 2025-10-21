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
    public int getSum(TreeNode root, int low, int high, int sum) {
        if (root == null) return sum;
        
        if (root.val >= low) sum = getSum(root.left, low, high, sum);
        if (root.val >= low && root.val <= high) sum += root.val;
        if (root.val <= high) sum = getSum(root.right, low, high, sum);

        return sum;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        return getSum(root, low, high, 0);
    }
}

// Time: O(N), space: O(1)
