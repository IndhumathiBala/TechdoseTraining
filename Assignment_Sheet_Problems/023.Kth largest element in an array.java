import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        if(n==1)return nums[0];
        else if(n==2)
        {
            int max=Math.max(nums[0],nums[1]);
            int min=Math.min(nums[0],nums[1]);
            if(k==1)return max;
            return min;
        }
        int pivot=nums[n-1];
        int i=0;
        for(int j=0;j<n-1;j++)
        {
            if(nums[j]<pivot)
            {
                i++;
                swap(i,j,nums);
            }
            
        }
        return nums[k];
//         nums[n-k]-->kth smallest
    }
    static void swap(int i,int j,int[]nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
