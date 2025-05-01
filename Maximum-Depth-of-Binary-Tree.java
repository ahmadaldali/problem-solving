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

    public int getDepth(TreeNode root, int depth) {
        if (root == null) return 0;

        int nextDepth = depth+1;
        if (root.left == null && root.right == null) {
            return nextDepth;
        }
        
        int leftDepth = getDepth(root.left, nextDepth);
        int rightDepth = getDepth(root.right, nextDepth);

        return leftDepth >= rightDepth ? leftDepth : rightDepth;
    }

    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }
}
