/**
 * author: seungw0n
 * question: Two Sum
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
 *  Memory Usage: 42.9 MB, less than 5.33% of Java online submissions for Binary Tree Preorder Traversal.
 * comment:
 *  Need to change the filename (Solution.java)
*/

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
    private ArrayList<Integer> lst = new ArrayList<>();
    
    private void rec(TreeNode root) {
        if (root == null) {
            return;
        }
        
        lst.add(root.val);
        rec(root.left);
        rec(root.right);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) { // root -> left -> right
        rec(root);
        return lst;
    }
}
