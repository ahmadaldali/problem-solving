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

    public void backtracking(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }

        // node != null
        path += node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        path += "->";
        
        backtracking(node.left, path, result);
        backtracking(node.right, path, result);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        backtracking(root, "", result);

        return result;
    }
}
