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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        Solve(root,list);
        Collections.sort(list);
        rec(root,list,0);
        
    }
    private void rec(TreeNode root,ArrayList<Integer> list,int index){
        if(root==null)
            return;
        rec(root.left,list,index);
        root.val=list.get(index);
        list.remove(0);
        rec(root.right,list,index);
    }
    private void Solve(TreeNode root,ArrayList<Integer> list){
        if(root==null)
            return ;
        Solve(root.left,list);
        list.add(root.val);
        Solve(root.right,list);
    }
}