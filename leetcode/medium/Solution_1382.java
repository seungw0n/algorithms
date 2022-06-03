/**
 * author: seungw0n
 * question: Balance a Binary Search Tree
 * details:
 *  Runtime: 5 ms, faster than 59.48% of Java online submissions for Balance a Binary Search Tree.
 *  Memory Usage: 61.5 MB, less than 35.23% of Java online submissions for Balance a Binary Search Tree.
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
    ArrayList<Integer> lst = new ArrayList<Integer>();
    
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        lst.add(root.val);
        inOrder(root.right);
    }
    
    private TreeNode balancedTree(int left, int right) {
        if (left > right) return null;
        
        int mid = (left + right) / 2;
        
        TreeNode node = new TreeNode(lst.get(mid));
        node.left = balancedTree(left, mid-1);
        node.right = balancedTree(mid+1, right);
        
        return node;
    }
    
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        
        root = balancedTree(0, lst.size()-1);
        
        return root;
    }
}
