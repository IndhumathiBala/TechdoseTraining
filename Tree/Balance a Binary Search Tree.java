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
    int index=0;
    List<Integer>list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return arrayToBST(root,0,list.size()-1);
    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        {
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        }
    }
    TreeNode arrayToBST(TreeNode root,int start,int end)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        root=new TreeNode(list.get(mid));
        root.left=arrayToBST(root,start,mid-1);
        root.right=arrayToBST(root,mid+1,end);
        return root;
    }
    
}
