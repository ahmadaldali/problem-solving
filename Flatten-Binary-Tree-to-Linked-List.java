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
   public void buildQueue(TreeNode root, Queue<TreeNode> q) {
        if (root == null) return;
        q.add(root);
        buildQueue(root.left, q);
        buildQueue(root.right, q);
   }
    
    public void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        buildQueue(root, q);

        q.poll(); // root
        while(!q.isEmpty()) {
            root.left = null;
            root.right = q.poll();
            root = root.right;
        }
    }
}

// Time and space: O(n)
