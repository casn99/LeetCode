/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }

        boolean leftSide = isSubPath(head, root.left);
        boolean rightSide = isSubPath(head, root.right);

        return dfs(head, root) || (leftSide || rightSide);

    }

    public boolean dfs(ListNode head, TreeNode root){

        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }

        boolean val = head.val == root.val;
        boolean leftSide = dfs(head.next, root.left);
        boolean rightSide = dfs(head.next, root.right);

        return val && (leftSide || rightSide);
    }
}