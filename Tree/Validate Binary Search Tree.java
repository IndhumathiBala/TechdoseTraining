class Solution {
    public boolean isValidBST(TreeNode root) {
           if(root==null || (root.left==null && root.right==null))
           {
               return true;
           }
          return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validate(TreeNode root,long min,long max)
    {
        if(root==null)
        return true;
        else if(root.val<=min || root.val>=max)
        return false;
        return validate(root.left,min,root.val) && 
        validate(root.right,root.val,max);
    }
}
