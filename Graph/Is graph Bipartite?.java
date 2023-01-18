class Solution {
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>>adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                adj.get(i).add(graph[i][j]);
            }
        }
        int []color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(!dfs(i,adj,color))
                {
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int node,List<List<Integer>>adj,int []color)
    {
        if(color[node]==-1)
        {
            color[node]=1;
        }
        for(int i:adj.get(node))
        {
            if(color[i]==-1)
            {
                color[i]=1-color[node];
                if(!dfs(i,adj,color))
                {
                    return false;
                }
            }
            else if(color[i]==color[node])
            {
                return false;
            }
        }
        return true;
    }
}
