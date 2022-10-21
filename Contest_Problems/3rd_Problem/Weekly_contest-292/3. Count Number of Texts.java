// 2266.https://leetcode.com/problems/count-number-of-texts/

class Solution {
    public int countTexts(String s) {
        int n=s.length();
        long []dp=new long[n+1];
        int mod=1000000007;
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            // System.out.println(dp[i-1]);
            char ch=s.charAt(i-1);
            dp[i]=dp[i-1];
            if(i>=2 && s.charAt(i-2)==ch)
                dp[i]=(dp[i]+dp[i-2])%mod;
            else
                continue;
            if(i>=3 && s.charAt(i-3)==ch)
                dp[i]=(dp[i]+dp[i-3])%mod;
            else
                continue;
            if(i>=4 && (s.charAt(i-1)=='7'||s.charAt(i-1)=='9' )&&s.charAt(i-4)==ch)
                dp[i]=(dp[i]+dp[i-4])%mod;
            
        }
        return (int)(dp[n]%mod);
    }
}
