class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
            
        }
        for(;j<nums.length;j++)
        {
            nums[j]=0;
        }
    }
}
