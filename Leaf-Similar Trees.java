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
import java.util.*;

class Solution {
    
    private void getLeaf(TreeNode root, List<Integer> result) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }
        
        getLeaf(root.left, result);
        getLeaf(root.right, result);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        getLeaf(root1, leaves1);
        getLeaf(root2, leaves2);
        
        return leaves1.equals(leaves2);
    }
}
