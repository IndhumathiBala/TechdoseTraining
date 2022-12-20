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
    Map<TreeNode,TreeNode>par;
    void findPar(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        //finding the parent
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node.left!=null)
            {
                par.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null)
            {
                par.put(node.right,node);
                q.add(node.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
           par=new HashMap<>();
           Map<TreeNode, Boolean>vis=new HashMap<>();
           Queue<TreeNode>q=new LinkedList<>();
           List<Integer>res=new LinkedList<>();
           q.add(target);
           findPar(root);
           vis.put(target,true);
           int level=0;
           while(!q.isEmpty())
           {
               int size=q.size();
               if(level==k)
               break;
               level++;
               for(int i=0;i<size;i++)
               {
                   TreeNode node=q.poll();
                   //traverse in left,right,up direction
                   if(node.left!=null && vis.get(node.left)==null)
                   {
                       vis.put(node.left,true);
                       q.add(node.left);
                   }
                   if(node.right!=null && vis.get(node.right)==null)
                   {
                       vis.put(node.right,true);
                       q.add(node.right);
                   }
                   if(par.get(node)!=null && vis.get(par.get(node))==null)
                   {
                       vis.put(par.get(node),true);
                       q.add(par.get(node));
                   }
               }
           }
           while(!q.isEmpty())
           {
               res.add(q.poll().val);
           } 
           return res;
    }
}
