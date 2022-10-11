class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                long tar=(long)target-(nums[i]+nums[j]);
                int l=j+1,h=n-1;
                while(l<h)
                {
                    if(nums[l]+nums[h]==tar)
                    {
                       res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h])); 
                       while(l<h && nums[l]==nums[l+1])l++;
                       while(l<h && nums[h]==nums[h-1])h--;
                       l++;h--;
                    }
                    else if(nums[l]+nums[h]<tar)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
                while(j<n-3 && nums[j]==nums[j+1])j++;
            }
            while(i<n-4 && nums[i]==nums[i+1])i++;
        }
        return res;
        
    }
}
