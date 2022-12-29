package prim;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
class Node implements Comparator<Node>
{
	int weight,vertices;
	Node(){}
	Node(int v,int w)
	{
		this.weight=w;
		this.vertices=v;
	}
	@Override
	public int compare(Node n1,Node n2)
	{
		if(n1.weight<n2.weight)
			return -1;
		else if(n1.weight>n2.weight)
			return 1;
		return 0;
	}
}
public class Prim {
	void primAlgo(int n,List<List<Node>>adj)
	{
		int dis[]=new int[n];
		int par[]=new int[n];
		boolean vis[]=new boolean[n];
		
		Arrays.fill(dis,Integer.MAX_VALUE);
		
		PriorityQueue<Node>pq=new PriorityQueue<>(n,new Node());
		dis[0]=0;
		pq.add(new Node(0,0));
		while(!pq.isEmpty())
		{
			Node temp=pq.poll();
			int par1=temp.vertices;
			int weight=temp.weight;
			vis[par1]=true;
			for(Node it:adj.get(par1))
			{
//	dijkstra=> if(!vis[it.vertices] && dis[par1]+it.weight<dis[it.vertices])
				if(!vis[it.vertices] && it.weight<dis[it.vertices])
				{
					dis[it.vertices]=it.weight;
					par[it.vertices]=par1;
					pq.add(new Node(it.vertices,dis[it.vertices]));
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" =>"+par[i]+" "+dis[i]);
		}
		
		
	}

}



package prim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<List<Node>>adj=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(new Node(1,1));
		adj.get(0).add(new Node(2,3));
		
		adj.get(1).add(new Node(0,1));
		adj.get(1).add(new Node(2,2));
		adj.get(1).add(new Node(3,5));
		
		adj.get(2).add(new Node(0,3));
		adj.get(2).add(new Node(3,4));
		adj.get(2).add(new Node(1,2));
		
		adj.get(3).add(new Node(1,5));
		adj.get(3).add(new Node(2,4));
		Prim p=new Prim();
		p.primAlgo(n,adj);

	}

}
