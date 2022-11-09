class Solution{
    Map<Integer,Integer>map=new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        for(int i=0;i<inorder.length;i++)
        {
                map.put(inorder[i],i);
        }
        TreeNode root=buildTree(preorder,0,preorder.length-1);
        return root;
    }
    
    
    public TreeNode buildTree(int []preorder,int left,int right)
    {
        if(left>right)
            return null;
        int val=preorder[index++];
        TreeNode root=new TreeNode(val);        root.left=buildTree(preorder,left,map.get(val)-1);
        root.right=buildTree(preorder,map.get(val)+1,right);
        return root;
        
    }
}
