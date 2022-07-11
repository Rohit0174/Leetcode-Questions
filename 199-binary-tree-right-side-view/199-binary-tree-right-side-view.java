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
    public List<Integer> rightSideView(TreeNode root) {
          List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        return list;
        queue.add(root);
        while(queue.size()!=0){
            int n=queue.size();
            for(int i=1;i<=n;i++){
                TreeNode temp=queue.poll();
                if(i==n){
                    list.add(temp.val);
                }
                if(temp.left!=null)
                queue.add(temp.left);
                if(temp.right!=null)
                queue.add(temp.right);
            }
        }
        return list;
    }
}