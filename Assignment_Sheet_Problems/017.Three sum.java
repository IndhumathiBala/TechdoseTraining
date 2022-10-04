class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length,a=0,l=0,h=0;
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                a=-1*nums[i];l=i+1;h=n-1;
                while(l<h)
                {
                    if(nums[l]+nums[h]==a)
                    {
                        res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                        while(l<h && nums[l]==nums[l+1])
                            l++;
                        while(l<h && nums[h]==nums[h-1])
                            h--;
                        l++;h--;
                    }
                    else if(nums[l]+nums[h]<a)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
            }
        }
        return res;
        
    }
}
