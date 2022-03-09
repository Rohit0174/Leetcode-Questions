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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
        Solve(root,list);
        return list;
    }
     private static void Solve(TreeNode root,List<Integer> list){
        if(root==null)return;
        
        Solve(root.left,list);
        Solve(root.right,list);
         list.add(root.val);


    }
}