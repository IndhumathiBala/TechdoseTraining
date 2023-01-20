class Solution {
        List<Boolean>res=new ArrayList<>();
        boolean table[][];
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        List<List<Integer>>adj=new ArrayList<>();
        int indegree[]=new int[n];
        table=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i[]:prerequisites)
        {
            adj.get(i[0]).add(i[1]);
            indegree[i[1]]++;
        }
        bfs(indegree,adj,n);
        for(int i=0;i<queries.length;i++)
        {
            res.add(table[queries[i][0]][queries[i][1]]);
        }
        return res;
    }
    void bfs(int []indegree,List<List<Integer>>adj,int n)
    {
            Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                if(indegree[i]==0)
                {
                    q.add(i);
                }
                
            }
        
            while(!q.isEmpty())
            {
                int node=q.poll();
                for(int it:adj.get(node))
                {
                    table[node][it]=true;
                    for(int i=0;i<n;i++)
                    {
                        if(table[i][node]==true)
                        {
                            table[i][it]=true;
                        }
                    }
                            indegree[it]--;
                            if(indegree[it]==0)
                            {
                                q.add(it);
                            }
                    
                }
            }

    }
}


