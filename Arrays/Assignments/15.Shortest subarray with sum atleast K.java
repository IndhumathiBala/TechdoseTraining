class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long []p=new long[n+1];
        for(int i=0;i<n;i++)
        {
            p[i+1]=p[i]+(long)nums[i];
        }
        int ans=n+1;
        Deque<Integer>q=new LinkedList<>();
        for(int i=0;i<p.length;i++)
        {
            while(!q.isEmpty() && p[i]<=p[q.getLast()])
                q.removeLast();
            while(!q.isEmpty() && p[i]>=p[q.getFirst()]+k)//if i subtract p[i] from queue's first elemnt is it still greater than or equal to k
                ans=Math.min(ans, i-q.removeFirst());
            q.addLast(i);
        }
        return ans<n+1?ans:-1;
    }
}
