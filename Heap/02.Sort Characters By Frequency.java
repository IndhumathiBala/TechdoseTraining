class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char ch:map.keySet())
        {
            q.add(ch);
        }
        String res="";
        while(!q.isEmpty())
        {
            int k=map.get(q.peek());
            char c=q.poll();
            res+=(""+c).repeat(k);
        }
        return res;
    }
    
}