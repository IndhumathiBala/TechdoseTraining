
// 2415.https://leetcode.com/contest/weekly-contest-311/problems/reverse-odd-levels-of-binary-tree/
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
    static void preorder(TreeNode r1,TreeNode r2,int level)
    {
        if(r1==null || r2==null)
            return;
        if(level%2==0)
        {
            int t=r1.val;
            r1.val=r2.val;
            r2.val=t;
        }
        preorder(r1.left,r2.right,level+1);
        preorder(r1.right,r2.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        
        preorder(root.left,root.right,0);
        return root;
    }
}
