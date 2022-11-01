import java.util.*;
class TreeNode {
    int data;
    boolean isNull;
    TreeNode LC, RC;

    public TreeNode(int x) {
        data = x;
        LC = null;
        RC = null;
    }

    public TreeNode() {
        data=-1;
        isNull = true;
    }
}
public class Main
{
        public static void insert(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
    
        while(!q.isEmpty()) {
            TreeNode u = q.poll();
    
            if(u.LC == null) {   
                u.LC = new TreeNode();
                break;
            }
    
            if(u.RC == null) {
                u.RC = new TreeNode();
                break;
            }
    
            if(!u.LC.isNull)
                q.offer(u.LC);
    
            if(!u.RC.isNull)
                q.offer(u.RC);
        }
    }
    public static void insert(TreeNode root, int x) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
    
        while(!q.isEmpty()) {
            TreeNode u = q.poll();
    
            if(u.LC == null) {   
                u.LC = new TreeNode(x);
                break;
            }
    
            if(u.RC == null) {
                u.RC = new TreeNode(x);
                break;
            }
    
            if(!u.LC.isNull)
                q.offer(u.LC);
    
            if(!u.RC.isNull)
                q.offer(u.RC);
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
        String  []s=str.split(" ");
        int x = Integer.parseInt(s[0]); 
        TreeNode root = new TreeNode(x);
        for(int i=1;i<s.length;i++)
        {
           if(s[i].equals("-"))
                insert(root);
            else
                insert(root, Integer.parseInt(s[i]));   
        }
         
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
	}
	static void preorder(TreeNode root)
	{
	    if(root!=null)
	    {
	        if(root.data!=-1)
	        System.out.print(root.data+" ");
	        preorder(root.LC);
	        preorder(root.RC);
	    }
	}
	static void inorder(TreeNode root)
	{
	    if(root!=null)
	    {
	        
	        inorder(root.LC);
	        
	        if(root.data!=-1)
	        System.out.print(root.data+" ");
	        inorder(root.RC);
	    }
	}
	static void postorder(TreeNode root)
	{
	    if(root!=null)
	    {
	        
	        postorder(root.LC);
	        postorder(root.RC);
	        if(root.data!=-1)
	        System.out.print(root.data+" ");
	    }
	}
}
