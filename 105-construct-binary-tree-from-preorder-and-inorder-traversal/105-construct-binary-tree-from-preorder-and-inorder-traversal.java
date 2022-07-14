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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int INS=0;
        int INE=inorder.length-1;
        int PRS=0;
        int PRE=preorder.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        
        return Solve(preorder,PRS,PRE,inorder,INS,INE,map);
    }
    private TreeNode Solve(int preorder[],int prs,int pre,int inorder[],int ins,int ine,HashMap<Integer,Integer> map){
        if(prs>pre || ins>ine)
            return null;
        
        int element=preorder[prs];
        TreeNode root=new TreeNode(element);
        int index=map.get(element);
        int nums=index-ins;
        
        root.left=Solve(preorder,prs+1,prs+nums,inorder,ins,index-1,map);
        root.right=Solve(preorder,prs+nums+1,pre,inorder,index+1,ine,map);
        return root;
    }
}