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
class Pair{
    TreeNode node;
    int index;
    public Pair(TreeNode node,int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max=0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));
        queue.add(new Pair(null,0));
        int left=0;
        int right=0;
        int level=1;
        while(queue.size()!=1){
            TreeNode node = queue.peek().node;
            int index = queue.peek().index;
            queue.poll();
            if(level==1){
                left = index;
                level=2;
            }
            if(node==null){
                max=Math.max(max,(right-left+1));
                level=1;
                queue.add(new Pair(null,0));
            }else{
                right=index;
                if(node.left!=null){
                    queue.add(new Pair(node.left,2*index));
                }
                 if(node.right!=null){
                    queue.add(new Pair(node.right,2*index+1));
                }
            }
            
        }
        max=Math.max(max,(right-left+1));
        return max;
    }
}










