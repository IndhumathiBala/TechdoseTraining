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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>list=new ArrayList<>();
            
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                if(temp.left!=null && temp.right!=null) 
                    if((temp.left.val==x && temp.right.val==y)||(temp.left.val==y && temp.right.val==x))
                    return false;
            }
            if(list.contains(x)&&list.contains(y))
                return true;
        }
        return false;
    }
}
