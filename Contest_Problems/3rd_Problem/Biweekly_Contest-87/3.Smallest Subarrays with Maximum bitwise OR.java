
// 2411. https://leetcode.com/contest/biweekly-contest-87/problems/smallest-subarrays-with-maximum-bitwise-or/

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        int res[]=new int[n],last[]=new int[30];
        for(int i=n-1;i>=0;i--)
        {
            res[i]=1;//current element itself contribute to maximum bitwise OR
            for(int j=0;j<30;j++)
            {
                if((nums[i]&(1<<j))>0)
                {
                    last[j]=i;//index where the last set bit is seen
                }
                res[i]=Math.max(res[i],last[j]-i+1);
            }
        }
        return res;
    }
}
