class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
           List<List<Integer>>adj=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
               adj.add(new ArrayList<>());
           }
           for(int i[]:dislikes)
           {
               adj.get(i[0]-1).add(i[1]-1);
               adj.get(i[1]-1).add(i[0]-1);
           }
           int color[]=new int[n];
           for(int i=0;i<n;i++)
           {
               if(color[i]==0 && !bfs(adj,i,color))
               {
                   return false;
               }
           }
           return true;
    }
    public boolean bfs(List<List<Integer>>adj,int par,int color[])
    {
        color[par]=1;
        Queue<Integer>q=new LinkedList<>();
        q.add(par);
        while(!q.isEmpty())
        {
            int i=q.poll();
            for(int child:adj.get(i))
            {
                if(color[child]==0)
                {
                    color[child]=color[i]==1?2:1;
                    q.add(child);
                }
                else if(color[child]==color[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
