class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(int i:map.keySet())
        {
            q.add(i);
        }
        for(int i=0;i<k;i++)
        {
            res.add(q.poll());
        }
        return res.stream().mapToInt(i->i).toArray();
        
    }
}
