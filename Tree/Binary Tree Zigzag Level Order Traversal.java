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
    int level=0;
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return res;
        levelOrder(root);
        return res;
    }
    public void levelOrder(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
            List<Integer>temp=new ArrayList<>();
            while(size-->0)
            {
                TreeNode node=q.poll();
                if(node!=null)
                {
                    temp.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(level%2==0)
                Collections.reverse(temp);
            if(temp.size()>0)
            res.add(new ArrayList<>(temp));
        }
    }
}
