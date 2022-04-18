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
    int flag=0;
    int cnt=0;
    public int kthSmallest(TreeNode root, int k) {
        Solve(root,k);
        return flag;
    }
    private void Solve(TreeNode root,int k){
        if(root==null)
            return ;
        Solve(root.left,k);
        cnt++;
        if(cnt==k){
            flag=root.val;
            return;
        }
        Solve(root.right,k);
    }
}