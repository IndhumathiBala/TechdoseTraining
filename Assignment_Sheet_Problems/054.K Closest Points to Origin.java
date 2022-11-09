class Solution {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->((b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])));
    public int[][] kClosest(int[][] points, int k) {
        for(int[] q:points)
        {
            
            pq.offer(q);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int res[][]=new int[k][2];
        int ind=0;
        while(!pq.isEmpty())
        {
            res[ind][0]=pq.peek()[0];
            res[ind++][1]=pq.poll()[1];
        }
        return res;
    }
}
