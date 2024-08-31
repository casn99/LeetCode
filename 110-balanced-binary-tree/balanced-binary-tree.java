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
    public boolean isBalanced(TreeNode root) {
        int left;
        int right;

        if(root == null){
            return true;
        }

        left = height(root.left);
        right = height(root.right);

        boolean isBal = Math.abs(left - right) < 2;
        return isBal && isBalanced(root.left) && isBalanced(root.right);

        
        
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left) + 1 , height(root.right) + 1);
    }
}
