class Solution {
		public int longestNiceSubarray(int[] nums) {
			int n = nums.length;
            int num=0,ans=0,j=0;
            for(int i=0;i<n;i++)
            {
                while((num &nums[i])!=0)//unset the bits of number which is not zero
                {
                    num^=nums[j++];
                }
                num|=nums[i];//setting bits with num
                ans=Math.max(ans,i-j+1);
            }
            return ans;
		}
	}
