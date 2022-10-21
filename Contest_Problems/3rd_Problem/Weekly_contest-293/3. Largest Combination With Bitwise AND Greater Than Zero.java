//2275.https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/

class Solution {
    public int largestCombination(int[] candidates) {
        int n=candidates.length;
        int res=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j:candidates)
            {
                if(((j>>i)&1)>0)
                    count++;
                    
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
