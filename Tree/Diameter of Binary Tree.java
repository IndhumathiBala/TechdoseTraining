class Solution {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return dia;
    }
    int findDia(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=findDia(root.left);
        int right=findDia(root.right);
        dia=Math.max(left+right,dia);
        return Math.max(left,right)+1;
    }
}
