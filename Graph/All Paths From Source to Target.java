class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j:graph[i])
            adj.get(i).add(j);
        }
        List<Integer>list=new ArrayList<>();
        list.add(0);
        dfs(adj,0,n-1,list);
        
    return res;
    }
    void dfs(List<List<Integer>>adj,int s,int d,List<Integer>list)
    {
        if(s==d)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int child:adj.get(s))
        {
                list.add(child);
                dfs(adj,child,d,list);
                list.remove(list.size()-1);
            
        }
        
    }
}
