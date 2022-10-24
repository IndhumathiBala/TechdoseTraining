class Solution{
    long maxSubarraySum(int arr[], int n){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            sum+=i;
            if(sum<i)
            sum=i;
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
    
}
