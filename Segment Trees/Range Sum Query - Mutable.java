class NumArray {
    int []st,arr;
    public NumArray(int[] nums) {
        int n=nums.length;
        st=new int[4*n];
        arr=Arrays.copyOfRange(nums,0,n);
        build(st,0,0,n-1);
    }
    public void build(int []st,int index,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        if(start==end)
        {
            st[index]=arr[start];
            return;
        }
        int mid=start+(end-start)/2;
        build(st,2*index+1,start,mid);
        build(st,2*index+2,mid+1,end);
        st[index]=st[2*index+1]+st[2*index+2];
    }
    public void update(int index, int val) {
          arr[index]=val;
         updateQ(0,0,arr.length-1,index,val);
    }
    public void updateQ(int u_index,int start,int end,int index,int val)
    {
        if(start>index || end<index)
        {
            return;
        }
        if(start==end)
        {
            st[u_index]=val;
            return;
        }
        int mid=start+(end-start)/2;
        updateQ(2*u_index+1,start,mid,index,val);
        updateQ(2*u_index+2,mid+1,end,index,val);
        st[u_index]=st[2*u_index+1]+st[2*u_index+2];
    }
    
    public int sumRange(int left, int right) {
        return findSum(left,right,0,0,arr.length-1);
    }
    public int findSum(int qs,int qe,int index,int start,int end)
    {
        if(qs>end || qe<start)
        {
            return 0;
        }
        if(start>=qs && end<=qe)
        {
            return st[index];
        }
        int mid=start+(end-start)/2;
        int left=findSum(qs,qe,2*index+1,start,mid);
        int right=findSum(qs,qe,2*index+2,mid+1,end);
        return left+right;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
