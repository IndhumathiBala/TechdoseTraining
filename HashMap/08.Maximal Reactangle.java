class Solution {
    public int maximalRectangle(char[][] matrix) {
        int []dp=new int[matrix[0].length];
        int maxArea=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                    dp[j]=matrix[i][j]=='1'?dp[j]+1:0;
            }
            maxArea=Math.max(maxArea,findMax(dp));
        }
        return maxArea;
        
    }
    static int findMax(int []dp)
    {
        int n=dp.length;
        int []left=new int[n];
        int []right=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && dp[i]<=dp[stack.peek()])
            {
                stack.pop();
            }
            left[i]=stack.isEmpty()?0:stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && dp[i]<=dp[stack.peek()])
            {
                stack.pop();
            }
            right[i]=stack.isEmpty()?n-1:stack.peek()-1;
            stack.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            int area=(right[i]-left[i]+1)*dp[i];
            max=area<max?max:area;
        }
        return max;
        
    }
}
