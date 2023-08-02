import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
    }
}
class TreeNode
{
    public Node create(String str)
    {
        String s[]=str.split(" ");
        int n=s.length;
        int i=1;
        if(n==0)return null;
        Queue<Node>q=new LinkedList<>();
        Node root=new Node(Integer.parseInt(s[0]));
        q.add(root);
        while(q.size()>0 && i<n)
        {
            Node temp=q.poll();
            if(!s[i].equals("N"))
            {
                int val=Integer.parseInt(s[i]);
                Node nn=new Node(val);
                temp.left=nn;
                
                q.add(temp.left);
            }
            i++;
            if(i<n)
            {
                if(!s[i].equals("N"))
                {
                    int val=Integer.parseInt(s[i]);
                    Node nn=new Node(val);
                    temp.right=nn;
                    q.add(temp.right);
                }   
                
            }
            i++;
        }
        return root;
    }
    public void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    TreeNode t=new TreeNode();
	    Node root=t.create(s);
	    t.inorder(root);
	}
}
