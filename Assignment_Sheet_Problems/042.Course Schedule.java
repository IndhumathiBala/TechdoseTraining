class Solution {
    public boolean canFinish(int V, int[][] p) {
          int n=p.length;
          List<List<Integer>>adj=new ArrayList<>();
          for(int i=0;i<V;i++)
          {
              adj.add(new ArrayList<>());
          }
          for(int i=0;i<n;i++)
          {
              adj.get(p[i][0]).add(p[i][1]);
          }
          List<Integer>res=topo(adj,n,V);
            if(res.size()==V)
                return true;
        return false;
    }
    List<Integer>topo(List<List<Integer>>adj,int n,int V)
    {
        int []indegree=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int j:adj.get(i))
            {
              indegree[j]++;  
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        List<Integer>res=new ArrayList<>();
        int ind=0;
        while(!q.isEmpty())
        {
            int parent=q.poll();
            res.add(parent);
            for(int it:adj.get(parent))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    q.add(it);
                }
            }
        }
        return res;
    }
}
