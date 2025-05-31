/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

public boolean contains(TreeNode parent, TreeNode child){

        if(parent == null){
            return false;
        }
        boolean leftContains = false;
        if(parent.left != null){
            leftContains = parent.left == child || contains(parent.left, child);
        }

        boolean rightContains = false;
        if(parent.right != null){
            rightContains = parent.right == child || contains(parent.right, child);
        }
        
        boolean is = parent == child;
        return leftContains || rightContains || is;
    }
    public boolean isCommonAncestor(TreeNode ancestor, TreeNode l, TreeNode r){
        return contains(ancestor,l) && contains(ancestor,r);

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(isCommonAncestor(root.left, p, q)){
            return lowestCommonAncestor(root.left, p,q);
        }else if(isCommonAncestor(root.right, p, q)){
            return lowestCommonAncestor(root.right, p,q);
        }else{
            return root;
        }
    }


 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if((root == p || root == q)){
            return root;
        }
        

        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);

        if(left != null && right != null){
            return root;
        }

        if(left != null){
            return left;
        }

        if(right != null){
            return right;
        }

        return null;
        
    }
}