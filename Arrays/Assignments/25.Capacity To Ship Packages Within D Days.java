//1011
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0,ans=0;
        for(int i:weights)
        {
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(check(mid,days,weights))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    boolean check(int mid,int d,int []nums)
    {
        int sum=0,need=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+sum<=mid)
            {
                sum+=nums[i];
            }
            else
            {
                need++;
                sum=nums[i];
            }
        }
        return need<=d;
    }
}
