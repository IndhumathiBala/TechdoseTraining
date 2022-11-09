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
    int good=0;
    public int goodNodes(TreeNode root) {
        
        maxVal(root,Integer.MIN_VALUE);
        return good;
        
    }
   public void maxVal(TreeNode root,int max)
    {
        if(root!=null)
        {
            int d=root.val;
            if(d>=max)
            {
                good++;
            }
            // max=Math.max(root.val,max);
            max=(Math.max(max,d));
            maxVal(root.left,max);
            maxVal(root.right,max);
        }
        return;        
    }
}
