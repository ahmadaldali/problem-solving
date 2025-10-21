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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList();
        queue.add(root);

        boolean leftFirst = true;
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int numberOfNodes = queue.size();

            for(int i=0;i<numberOfNodes;i++) {
                if(leftFirst) {
                    TreeNode currentNode = queue.remove();   
                    if(currentNode.left != null) queue.add(currentNode.left);
                    if(currentNode.right != null) queue.add(currentNode.right);

                    levelNodes.add(currentNode.val);
                } else {
                    TreeNode currentNode = queue.removeLast(); // take right  
                    if(currentNode.right != null) queue.addFirst(currentNode.right);
                    if(currentNode.left != null) queue.addFirst(currentNode.left);

                    levelNodes.add(currentNode.val);
                }             
            }

            result.add(levelNodes);
            leftFirst = !leftFirst;
        }

        return result;
    }
}
