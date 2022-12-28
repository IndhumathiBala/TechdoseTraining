class Solution {
    int []par;
    public int countComponents(int n, int[][] edges) {
        par=new int[n];
        int comp=0;
        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
        for(int i[]:edges)
        {
            union(i[0],i[1]);
        }
        for(int i=0;i<n;i++)
        {
            if(par[i]==i)
            {
                comp++;
            }
        }
        return comp;
    }
    void union (int i,int j)
    {
        int u=findPar(i);
        int v=findPar(j);
        if(u==v)
        {
            return;
        }
        else{
            par[u]=v;
        }
    }
    int findPar(int i)
    {
        if(par[i]==i)
        return i;
        return par[i]=findPar(par[i]);
    }
}
