class Solution {
    int height(TreeNode t) {
        if (t == null) return 0;
        return 1 + Math.max(height(t.left), height(t.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 
            && isBalanced(root.left) 
            && isBalanced(root.right);
    }
}
