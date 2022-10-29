class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2)
            return 0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int size=(int)Math.ceil((double)(max-min)/(n-1));
        int minA[]=new int[n-1];
        int maxA[]=new int[n-1];
        Arrays.fill(minA,Integer.MAX_VALUE);
        Arrays.fill(maxA,Integer.MIN_VALUE);
        for(int i=0;i<n;i++)
        {
            if(nums[i]==min || nums[i]==max)
                continue;
            int index=(nums[i]-min)/size;
            minA[index]=Math.min(minA[index],nums[i]);
            maxA[index]=Math.max(maxA[index],nums[i]);
        }
        int maxGap=0;
        for(int i=0;i<n-1;i++)
        {
            if(maxA[i]==Integer.MIN_VALUE)
            {
                continue;
            }
            maxGap=Math.max(maxGap,minA[i]-min);
            min=maxA[i];
        }
        maxGap=Math.max(maxGap,max-min);
        return maxGap;
    }
}
