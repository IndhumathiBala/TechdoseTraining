class Solution {
public int maxSubArray(int[] nums) {
    int max=Integer.MIN_VALUE,sum=0;
    for(int i:nums)
    {
        sum+=i;
    if(sum<i)
    {
        sum=i;
    }
    max=Math.max(max,sum);
    }
    return max;
}}
