/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode successor,prev;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode node=p;
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
            {
                node=node.left;
                
            }
            successor=node;
        }
        else{
            inorder(root,p);
        }
        return successor;

    }
    public void inorder(TreeNode root,TreeNode p)
    {
        if(root!=null)
        {
            inorder(root.left,p);
            if(prev==p )
            {
                successor=root;
            }
            //tracking previous node
            prev=root;
            inorder(root.right,p);
        }
    }
}
