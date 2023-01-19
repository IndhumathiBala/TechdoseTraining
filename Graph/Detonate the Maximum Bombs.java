class Solution {
    Map<Integer,List<Integer>>adj;
    public int maximumDetonation(int[][] bombs) {
            int n=bombs.length,max=0;
            adj=findNeighbors(bombs,n);
            for(int i=0;i<n;i++)
            {
                int size=bfs(i,adj);
                max=Math.max(max,size);
            }
            return max;

    }
    Map<Integer,List<Integer>>findNeighbors(int [][]bombs,int n)
    {
         Map<Integer,List<Integer>>adj=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            long x1=bombs[i][0],y1=bombs[i][1],r=bombs[i][2];
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int x2=bombs[j][0],y2=bombs[j][1];
                if(i!=j)
                {
                    long d=(long)(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
                    if(d<=(long)r*r)
                    {
                        list.add(j);
                    }
                }
            }
            adj.put(i,list);
        }
        return adj;
    }
    int bfs(int i,Map<Integer,List<Integer>>adj)
    {
        Queue<Integer>q=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        q.add(i);
        res.add(i);
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                int node=q.poll();
                for(int it:adj.get(node))
                {
                    if(!res.contains(it))
                    {
                        res.add(it);
                        q.add(it);
                    }
                }
            }
        }
        return res.size();
    }
}
