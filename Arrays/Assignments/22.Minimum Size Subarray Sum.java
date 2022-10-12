class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE,n=nums.length;
        int sum=0,j=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            while(j<n && sum>=target)
            {
                min=Math.min(min,i-j+1);
                sum-=nums[j++];
            }
            
        }
        return min!=Integer.MAX_VALUE?min:0;
        
    }
}
