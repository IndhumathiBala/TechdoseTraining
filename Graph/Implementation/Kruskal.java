import java.util.*;
class Node 
{
    int s,d,weight;
    Node(int s,int d,int w)
    {
        this.s=s;
        this.d=d;
        this.weight=w;
    }
    
}

public class Main
{
    int n=6;
    int par[]=new int[n];
    int rank[]=new int[n];
    public int findPar(int u,int par[])
    {
        if(par[u]==u)
        return u;
        return par[u]=findPar(par[u],par);
    }
    public void union(int u,int v,int par[])
    {
        u=findPar(u,par);
        v=findPar(v,par);
        if(rank[u]<rank[v])
        {
            par[u]=par[v];
        }
        else if(rank[v]<rank[u])
        {
            par[v]=par[u];
            
        }
        else{
            par[v]=par[u];
            rank[u]+=1;
        }
    }
    public void kruskal(List<Node>adj,int n)
    {
        // for(int i=0;i<10;i++)
        // System.out.println(adj.get(i).s+" "+adj.get(i).d+" "+adj.get(i).weight);
        Collections.sort(adj,(a,b)->a.weight-b.weight);
        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
        List<Node>res=new ArrayList<>();
        for(Node it:adj)
        {
            if(findPar(it.s,par)!=findPar(it.d,par))
            {
                res.add(it);
                union(it.s,it.d,par);
            }
        }
        for(Node it:res)
        {
            System.out.println(it.s+" "+it.d);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Node>adj=new ArrayList<>();
		adj.add(new Node(3,5,4));
		adj.add(new Node(4,5,3));
		adj.add(new Node(1,4,3));
		adj.add(new Node(1,2,3));
		adj.add(new Node(3,4,2));
		adj.add(new Node(2,3,2));
		adj.add(new Node(0,2,2));
		adj.add(new Node(2,4,1));
		adj.add(new Node(1,3,1));
		adj.add(new Node(0,1,1));
		 
		Main k=new Main();
		k.kruskal(adj,6);
		
		
	}
}
