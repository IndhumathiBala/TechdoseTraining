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
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return res;
        recur(root);
        return res;
    }
    public void recur(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>temp=new ArrayList<>();
            while(size-->0)
            {
                TreeNode node=q.poll();
                temp.add(node.val);
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
        res.add(new ArrayList<>(temp));
        }
    }
}
