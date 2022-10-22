class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        List<Integer>list=new ArrayList<>();
        for(int i:set)
        {
            list.add(i);
        }
        for(int i:list)
        {
            int k=findRev(i);
            set.add(k);
        }
        return set.size();
        
    }
    static int findRev(int i)
    {
        StringBuilder sb=new StringBuilder(""+i);
        return Integer.parseInt(sb.reverse().toString());
    }
}
