

// RECURSION=>  TC:O(2^N)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		int m=s1.length(),n=s2.length();
		System.out.println(findLCS(s1,s2,m,n));
	}
	static int findLCS(String s1,String s2,int m,int n)
	{
	    if(m==0 || n==0)
	    {
	        return 0;
	    }
	    else if(s1.charAt(m-1)==s2.charAt(n-1))
	    {
	        return 1+findLCS(s1,s2,m-1,n-1);
	    }
	    return Math.max(findLCS(s1,s2,m-1,n),findLCS(s1,s2,m,n-1));
	}
}


// MEMOIZATION  =>TC:O(MXN)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		int m=s1.length(),n=s2.length();
		int mem[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
		    Arrays.fill(mem[i],-1);
		}
		int k=findLCS(s1,s2,m,n,mem);
		System.out.println(k);
	}
	static int findLCS(String s1,String s2,int m,int n,int mem[][])
	{
	    if(m==0 || n==0)
	    {
	        return 0;
	    }
	    if(mem[m][n]!=-1)
	    {
	        return mem[m][n];
	    }
	    if(s1.charAt(m-1)==s2.charAt(n-1))
	    {
	        return mem[m][n]=1+findLCS(s1,s2,m-1,n-1,mem);
	    }
	    return mem[m][n]=Math.max(findLCS(s1,s2,m-1,n,mem),findLCS(s1,s2,m,n-1,mem));
	
	}
}
// abcdgh
// aedfhr
// 3





// DP  TC:O(MXN)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		int m=s1.length(),n=s2.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
		    for(int j=0;j<=n;j++)
		    {
		        if(i==0 || j==0)
		        {
		            dp[i][j]=0;
		        }
		        else if(s1.charAt(i-1)==s2.charAt(j-1))
		        {
		            dp[i][j]=1+dp[i-1][j-1];
		        }
		        else
		        {
		            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		        }
		    }
		    
		}
		System.out.println(dp[m][n]);
	}
}
// abcdgh
// aedfhr
// 3


