import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    List<Integer>list=new ArrayList<>();
	    boolean []prime=new boolean[n+1];
	    prime[1]=true;
	    for(int i=2;i*i<=n;i++)
	    {
	        if(prime[i]==false)
	        {
	            for(int j=i*i;j<=n;j+=i)
	            {
	                prime[j]=true;
	            }
	        }
	    }
	    for(int i=1;i<=n;i++)
	    {
	        if(prime[i]==false)
	        {
	            list.add(i);
	        }
	    }
	    for(int i:list)
	    {
	        System.out.println(i);
	    }
	    
	}
}
