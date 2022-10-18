class Solution {
    public int sumSubarrayMins(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []prev=new int[n];
        int []next=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
            {
                prev[stack.peek()]=i-stack.peek()-1;
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            prev[stack.peek()]=n-stack.pop()-1;
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
            {
                next[stack.peek()]=stack.peek()-i-1;
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            next[stack.peek()]=stack.pop();
        }
        long ans=0;
        long mod=1000000007;
        for(int i=0;i<n;i++)
        {
            long val=nums[i];
          ans=(ans+((prev[i]+1L)*(next[i]+1)*val)%mod)%mod;  
        }
        return (int)ans;
                   
    }
}
