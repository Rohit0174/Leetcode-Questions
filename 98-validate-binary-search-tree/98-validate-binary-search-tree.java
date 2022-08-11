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
    public boolean isValidBST(TreeNode root) {
        long max=Long.MAX_VALUE;
        long min=Long.MIN_VALUE;
        
        return Solve(root,max,min);
    }
    private boolean Solve(TreeNode root,long max,long min){
        if(root==null)
            return true;
        if(root.val>=max || root.val<=min)
            return false;
        return Solve(root.left,root.val,min) && Solve(root.right,max,root.val);
    }
}