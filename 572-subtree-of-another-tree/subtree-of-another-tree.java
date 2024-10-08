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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        boolean isSame = true;
        if(isSameTree(root, subRoot)){
            return true;
        }

        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        isSame = isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

        return isSame;




    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean sameTree  = true;
        if(p == null ^ q == null){
            return false;
        }

        if(p == null && q == null){
            return true;
        }

        if( p.val != q.val){
            return false;
        }
        
        sameTree = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return sameTree;
        
    }
}
