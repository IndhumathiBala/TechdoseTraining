class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>q=new ArrayDeque<>();
        List<Integer>res=new ArrayList<>();
        int i=0;
        for(;i<k;i++)
        {
            while(!q.isEmpty() && nums[q.getLast()]<=nums[i])
            {
                q.removeLast();
            }
            q.add(i);
        }
        for(;i<nums.length;i++)
        {
            res.add(nums[q.peek()]);
            while(!q.isEmpty() && q.getFirst()<=i-k)
            {
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.getLast()]<=nums[i])
            {
                q.removeLast();
            }
            q.add(i);
        }
        if(!q.isEmpty())
        res.add(nums[q.getFirst()]);
        return res.stream().mapToInt(j->j).toArray();
        
    }
}
