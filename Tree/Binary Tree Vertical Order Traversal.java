//User function Template for Java
 class Tuple
    {
        Node node;
        int x,y;
        Tuple(Node node,int x,int y)
        {
            this.node=node;
            this.x=x;
            this.y=y;
            
        }
    }

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
   
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer>res=new ArrayList<>();
        // add your code here
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>>map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple a=q.poll();
            int x=a.x;
            int y=a.y;
            if(!map.containsKey(x))
            {
                map.put(x,new TreeMap<Integer,ArrayList<Integer>>());
            }
            if(!map.get(x).containsKey(y))
            {
                map.get(x).put(y,new ArrayList<Integer>());
            }
            map.get(x).get(y).add(a.node.data);
            if(a.node.left!=null)
            {
                q.add(new Tuple(a.node.left,x-1,y+1));
            }
            if(a.node.right!=null)
            {
                q.add(new Tuple(a.node.right,x+1,y+1));
            }
            
        }
        for(TreeMap<Integer,ArrayList<Integer>>z:map.values())
        {
            for(ArrayList<Integer>p:z.values())
            {
                while(!p.isEmpty())
                {
                    res.add(p.remove(0));
                }
                
            }
        }
        return res;
    }
}
