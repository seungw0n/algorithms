/**
 * author: seungw0n
 * question: Leaf-Similar Trees
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
 *  Memory Usage: 40.1 MB, less than 88.44% of Java online submissions for Leaf-Similar Trees.
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
    
    
    private void dfs(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            // leaf
            list.add(root.val);
            return;
        }
        
        dfs(root.left, list);
        dfs(root.right, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        dfs(root1, list1);
        dfs(root2, list2);
        
        return list1.equals(list2);

    }
}
