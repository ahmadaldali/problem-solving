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
import java.util.ArrayList;

class Solution {

    public boolean isValid(TreeNode root, ArrayList<Integer> previousNode) {
        if (root == null) return true;

        if (!isValid(root.left, previousNode)) {
            return false;
        }

        if (!previousNode.isEmpty() && root.val <= previousNode.get(previousNode.size() - 1)) {
            return false;
        }
        
        previousNode.add(root.val);
        
        return isValid(root.right, previousNode);
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, new ArrayList<Integer>());
    }
}
