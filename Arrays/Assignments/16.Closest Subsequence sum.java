class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int n=nums.length;
        int mid=(n-1)/2;
        List<Integer>s1=findSum(nums,0,mid,n);
        List<Integer>s2=findSum(nums,mid+1,n-1,n);
        Collections.sort(s2);
        int res=closest(s1,s2,goal);
        return res;
    }
    static List<Integer>findSum(int []nums,int low,int high,int k)
    {
        int sum=0,ind=0;
        int n=(high-low)+1;
        int []arr=new int[n+1];
        List<Integer>res=new ArrayList<>();
        for(int i=low;i<=high;i++)
        {
            arr[ind++]=nums[i];
        }
        for(int i=0;i<(1<<n);i++)
        {
            sum=0;
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))>0)
                {
                    sum+=arr[j];
                }
            }
            res.add(sum);
        }
        
        return res;
    }
    static int closest(List<Integer>l1,List<Integer>l2,int target)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,len1=l1.size(),len2=l2.size();
        for(int i=0;i<len1;i++)
        {
            int x=l1.get(i);
            int low=0,high=len2-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                int sum=x+l2.get(mid);
                if(sum==target)
                    return 0;
                else if(sum>target)//if greater than target should be close to target to get min value
                {
                    min=Math.min(min,sum);
                    high=mid-1;
                }
                else//if smaller than target should be max as possible to get closer value 
                {
                    max=Math.max(max,sum);
                    low=mid+1;
                }
                
            }
        }
        return Math.min(Math.abs(min-target),Math.abs(max-target));
    }
}
