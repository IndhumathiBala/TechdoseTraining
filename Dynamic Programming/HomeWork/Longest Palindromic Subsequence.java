class Solution
{
    public int longestPalinSubseq(String s)
    {
        //code here
        int m=s.length();
        StringBuilder sb=new StringBuilder(s);
        String t=sb.reverse().toString();
        int [][]dp=new int[m+1][m+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][m];
    }
}

