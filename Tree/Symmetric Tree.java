class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null )
            return true;
        return recur(root.left,root.right);
    }
    boolean recur(TreeNode r1,TreeNode r2)
    {
        if((r1==null||r2==null))
            return r1==r2;
        if(r1.val!=r2.val)
            return false;
        return recur(r1.left,r2.right) && recur(r1.right,r2.left);
        // return false;
    }
}
