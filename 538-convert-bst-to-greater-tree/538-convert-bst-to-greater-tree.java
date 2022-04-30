class Solution {
    public TreeNode convertBST(TreeNode root) {
        reversePreOrder(root, 0);
        return root;
    }
    
    private int reversePreOrder(TreeNode current, int presum) {
        if (current == null) return presum;
        int rightSum = reversePreOrder(current.right, presum);
        current.val = rightSum + current.val;
        int leftSum = reversePreOrder(current.left, current.val);
        if (current.left != null) return leftSum;
        else return current.val;
    }
}