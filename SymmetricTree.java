class Solution {

    boolean Helper(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null || t1.val!=t2.val) return false;
        return Helper(t1.left,t2.right) && Helper(t1.right,t2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return Helper(root.left,root.right);
    }
}
