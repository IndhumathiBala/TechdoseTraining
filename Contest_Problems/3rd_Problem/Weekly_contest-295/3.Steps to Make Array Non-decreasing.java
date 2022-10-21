// 2289.https://leetcode.com/contest/weekly-contest-295/problems/steps-to-make-array-non-decreasing/

class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int ans=0;
        Stack<Pair<Integer,Integer>>stack=new Stack<>();
        stack.push(new Pair<>(nums[n-1],0));
        for(int i=n-2;i>=0;i--)
        {
            int count=0;
            while(!stack.isEmpty() && stack.peek().getKey()<nums[i])
            {
                count=Math.max(count+1,stack.peek().getValue());
                stack.pop();
                    
            }
            ans=Math.max(ans,count);
            stack.push(new Pair(nums[i],count));
        }
        return ans;
    }
}
