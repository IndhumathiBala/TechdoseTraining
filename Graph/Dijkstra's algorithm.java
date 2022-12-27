class Pair
{
    int v,weight;
    Pair(int v,int w)
    {
        this.v=v;
        this.weight=w;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj,int S)
    {
        int []dis=new int[V];
        int []par=new int[V];
        Arrays.fill(par,-1);
        boolean[]vis=new boolean[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new Pair(S,0));
        dis[S]=0;
        while(!pq.isEmpty())
        {
            Pair temp=pq.poll();
            //to remove duplicate nodes
            while(!pq.isEmpty() && pq.peek().v==temp.v)
            {
                pq.poll();
            }
            int pv=temp.v,pw=temp.weight;
            vis[pv]=true;
            for(ArrayList<Integer>it:adj.get(pv))
            {
                if(!vis[it.get(0)] && dis[it.get(0)]>dis[pv]+it.get(1))
                {
                    dis[it.get(0)]=dis[pv]+it.get(1);
                    pq.add(new Pair(it.get(0),dis[it.get(0)]));
                }
            }
        }
        return dis;
    }
}
