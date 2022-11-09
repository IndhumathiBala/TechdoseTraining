class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int low=0,high=n-1;
        quickSelect(nums,low,high,k);
        return nums[k-1];
    }
    void quickSelect(int[]nums,int low,int high,int k)
    {
        
        if(low<high)
        {
            int p=partition(nums,low,high);
            if(p+1==k)
                return;
            else if(p<k)
            {
               
            quickSelect(nums,p+1,high,k);
            }
            else if(p>=k)
            {
            quickSelect(nums,low,p-1,k);
            }
            
        }
    }
    int partition(int []nums,int l,int h)
    {
        int i=l-1;
        for(int j=l;j<h;j++)
        {
           if(nums[j]>nums[h])
           {
              swap(nums,++i,j); 
           }
        }
        swap(nums,i+1,h);
        return i+1;
    }
    void swap(int []nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
