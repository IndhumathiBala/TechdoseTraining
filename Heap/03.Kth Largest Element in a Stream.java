class KthLargest {
    PriorityQueue<Integer>q;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        q=new PriorityQueue<Integer>();
        for(int i:nums)
        {
            q.add(i);
        }
        while(q.size()>k)
            q.poll();
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size()>k)
            q.poll();
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */