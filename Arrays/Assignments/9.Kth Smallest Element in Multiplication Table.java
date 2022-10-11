class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1,high=m*n;
        while(low<=high)
        {
            int mid=(low+(high-low)/2);
            if(ok(mid,m,n,k))
            {
                    low=mid+1;
            }
             
            else
            {
                high=mid-1;
            }    
        
        }
        return low;
        
    }
    static boolean ok(int ele,int m,int n,int k)
    {
        int sum=0;
        for(int i=1;i<=m;i++)
        {
            sum+=Math.min(ele/i,n);
        }
        return sum<k;
    }
}
