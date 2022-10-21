// 2233
class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        int mod=1000000007;
        for(int i:nums)
            q.add(i);
        while(k-->0)
        {
            q.add(q.poll()+1);
        }
        long pro=1;
        while(!q.isEmpty())
        {
            pro=(pro*q.poll())%mod;
        }
        return (int)pro;
    }
}
