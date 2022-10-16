
// 2359.https://leetcode.com/contest/weekly-contest-304/problems/find-closest-node-to-given-two-nodes/

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) 
    {
        int n=edges.length,ans=edges.length,max=-1,closest=-1;
        boolean []visited=new boolean[n];  
        int []dist_1=new int[n];
        int []dist_2=new int[n];
        Arrays.fill(dist_1,-1);
        Arrays.fill(dist_2,-1);
        dfs(node1,edges,dist_1,visited,0);
        visited=new boolean[n];
        dfs(node2,edges,dist_2,visited,0);
        for(int i=0;i<n;i++)
        {
            if(dist_1[i]!=-1 && dist_2[i]!=-1)
            {
                if(Math.max(dist_1[i],dist_2[i])<ans)
                {
                ans=Math.max(dist_1[i],dist_2[i]);
                closest=i;
                }
            }
        }
        return closest;
        
    }
    void dfs(int node,int edges[],int []dist,boolean[]visited,int d)
    {
        if(node!=-1 && !visited[node] )
        {
            visited[node]=true;
            dist[node]=d;
            dfs(edges[node],edges,dist,visited,d+1);
        }
    }
}
