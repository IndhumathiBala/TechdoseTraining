import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="abcdxyz",s2 = "xyzabcd";
		int m=s1.length(),n=s2.length();
		System.out.println(lcs(s1,s2,m,n,0));
		
	}
	static int lcs(String s1,String s2,int m, int n,int count)
	{
	    if(m==0 || n==0)
	    {
	        return count;
	    }
	    else if(s1.charAt(m-1)==s2.charAt(n-1))
	    {
	        count=lcs(s1,s2,m-1,n-1,count+1);
	    }
	    count=Math.max(count,Math.max(lcs(s1,s2,m-1,n,0),lcs(s1,s2,m,n-1,0)));
	    return count;
	}
}
// ==================================================================================================
// DP
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="abcdxyz",s2 = "xyzabcd";
		int m=s1.length(),n=s2.length(),max=0;
		int [][]dp=new int[m+1][n+1];
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
		            max=Math.max(max,dp[i][j]);
		        }
		        else{
		            dp[i][j]=0;
		        }
		    }
		}
		System.out.print(max);
		
	}
}

