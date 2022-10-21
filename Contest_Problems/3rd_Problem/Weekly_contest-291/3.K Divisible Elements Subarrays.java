
// 2261.https://leetcode.com/contest/weekly-contest-291/problems/k-divisible-elements-subarrays/
class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n=nums.length;
        Set<String>set=new HashSet();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder();
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]%p==0)
                {
                    count++;
                }
                if(count>k)
                {
                    break;
                }
                sb.append(nums[j]+"_");
                set.add(sb.toString());
            }
        }
        return set.size();
        
    }
}
