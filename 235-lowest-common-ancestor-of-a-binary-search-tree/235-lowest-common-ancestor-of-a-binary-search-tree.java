/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
      if(root==null || root==n1 || root==n2)return root;
		TreeNode left=lowestCommonAncestor(root.left,n1,n2);
		TreeNode right=lowestCommonAncestor(root.right,n1,n2);
		if(left!=null && right!=null)return root;
		else if(right==null)return left;
		else
		return right;
    }
}