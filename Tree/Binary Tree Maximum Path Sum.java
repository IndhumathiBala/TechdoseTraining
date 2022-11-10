class Solution {
    int res;
    public int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        findSum(root);
        return res;
    }
    int findSum(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=findSum(root.left);
        int right=findSum(root.right);
        int ms=Math.max(Math.max(left,right)+root.val,root.val);
        int m21=Math.max(left+right+root.val,ms);
        res=Math.max(res,m21);
        return ms;
    }
    
}
