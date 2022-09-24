class Solution {
public boolean wordBreak(String s,List<String>wordDict) {
        int n = s.length();
        boolean dp[][]=new boolean[n+1][n+1];
        
        Set<String>set=new HashSet<>();
        for(String word: wordDict)
            set.add(word);
        
        for(int length=1;length<=n;++length) //Window Size
        {
            int start = 1;
            int end = length;
            while(end<=n) //Sliding Window
            {
                String temp = s.substring(start-1,end);
                if(set.contains(temp))
                    dp[start][end] = true;
                else
                {
                    boolean flag = false;
                    for(int i=start;i<end;++i)
                    {
                        if(dp[start][i] && dp[i+1][end])
                        {
                            flag = true;
                            break;
                        }
                    }
                       dp[start][end] = flag;
                    
                }
                end+=1;
                start+=1;
            }
        }
        return dp[1][n];
    }
}
