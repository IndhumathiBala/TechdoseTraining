class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int k=binarySearch(nums,left,right,target);
        
        return k;
    }
    public int binarySearch(int nums[],int left,int right,int target)
    {
            if(left>right)
                return -1;
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[left]<=nums[mid])
            {
                if(target>=nums[left] && target<=nums[mid])
                    return binarySearch(nums,left,mid-1,target);
                return binarySearch(nums,mid+1,right,target);
            }
            else if(target>nums[mid] && target<=nums[right])
                return binarySearch(nums,mid+1,right,target);
            return binarySearch(nums,left,mid-1,target);
    }
}
