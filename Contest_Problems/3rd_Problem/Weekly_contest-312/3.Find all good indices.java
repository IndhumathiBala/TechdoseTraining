// https://leetcode.com/contest/weekly-contest-312/problems/find-all-good-indices/

class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];
        ArrayList<Integer>res=new ArrayList<>();
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
                left[i]=left[i-1]+1;
            else
                left[i]=1;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<=nums[i+1])
                right[i]=right[i+1]+1;
            else
                right[i]=1;
        }
        for(int i=k;i<=n-k;i++)
        {
            if(left[i-1]>=k && right[i+1]>=k)
                res.add(i);
        }
        return res;
        
    }
}
