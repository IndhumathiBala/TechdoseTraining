class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        if(n==1)
            return nums[0];
        int []left=new int[n];
        int []right=new int[n];
        stack.push(0);
        left[0]=0;
        right[n-1]=n-1;
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && nums[i]<=nums[stack.peek()])
            {
                stack.pop();
            }
            left[i]=stack.isEmpty()?0:stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        stack.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[i]<=nums[stack.peek()])
            {
                stack.pop();
            }
            right[i]=stack.isEmpty()?n-1:stack.peek()-1;
            stack.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            int area=((right[i]-left[i]+1)*nums[i]);
            max=area<max?max:area;
        }
        return max;
    }
}
