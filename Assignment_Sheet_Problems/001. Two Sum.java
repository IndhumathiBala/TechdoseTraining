class Solution {
    public int[] twoSum(int[] nums, int target) {
//       TC:O(N^2)   SC:O(1)
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //             return new int[]{i,j};
        //     }
        // }
        // return new int[]{-1,-1};
      
      
      
      
//       TC:O(N)     SC:O(N)
        int res[]=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target-nums[i]);break;
            }
            map.put(nums[i],i);
            
        }
        return res;
        
    }
}
