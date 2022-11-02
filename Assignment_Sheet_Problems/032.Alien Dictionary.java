class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
          List<List<Integer>>adj=new ArrayList<>();
          for(int i=0;i<K;i++)
          {
              adj.add(new ArrayList<>());
          }
          for(int i=0;i<dict.length-1;i++)
          {
              int min=Math.min(dict[i].length(),dict[i+1].length());
              for(int j=0;j<min;j++)
              {
                  if(dict[i].charAt(j)!=dict[i+1].charAt(j))
                  {
                      int ind=dict[i].charAt(j)-'a';
                      adj.get(ind).add(dict[i+1].charAt(j)-'a');
                      break;
                  }
              }
          }
        //   topo(adj);
          int []to=topo(adj,K);
          String ans="";
          for(int it:to)
          {
              ans+=""+(char)(it+'a');
          }
          return ans;
    }
    static int[] topo(List<List<Integer>>adj,int K)
    {
        int []indegree=new int[K];
        for(int i=0;i<adj.size();i++)
        {
            for(int j:adj.get(i))
            {
                indegree[j]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<adj.size();i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int res[]=new int[adj.size()];
        int ind=0;
        while(!q.isEmpty())
        {
                int parent=q.poll();
                res[ind++]=parent;
            for(int j:adj.get(parent))
            {
                indegree[j]--;
                if(indegree[j]==0)
                {
                    q.add(j);
                }
            }
        }
        return res;
    }
}
