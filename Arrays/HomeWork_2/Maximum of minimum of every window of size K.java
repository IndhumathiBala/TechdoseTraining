import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),max=Integer.MIN_VALUE;
	    int []arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    Deque<Integer>q=new ArrayDeque<>();
	    ArrayList<Integer>res=new ArrayList<>();
	    int k=sc.nextInt(),i=0;
	    for(i=0;i<k;i++)
	    {
	        while(!q.isEmpty() && arr[i]<arr[q.getFirst()])
	        {
	            q.poll();
	        }
	        q.add(i);
	    }
	    for(;i<n;i++)
	    {
	        max=Math.max(max,arr[q.getFirst()]);
	        res.add(arr[q.getFirst()]);
	        while(!q.isEmpty() && q.getFirst()<=i-k)
	        {
	            q.poll();
	        }
	        while(!q.isEmpty() && arr[i]<arr[q.getFirst()])
	        {
	            q.poll();
	        }
	        
	        q.add(i);
	    }
	    max=Math.max(max,arr[q.getFirst()]);
	    res.add(arr[q.getFirst()]);
	    for(int j:res)
	    {
	        System.out.println(j);
	    }
	    System.out.println(max);
	}
}
