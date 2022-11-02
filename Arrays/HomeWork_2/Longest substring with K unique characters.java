class Solution {
    public int longestkSubstr(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();
        int n=s.length(),i=0,j=0,max=-1;
        while(i<n)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.size()>k)
            {
                if(map.get(s.charAt(j))==1)
                {
                    map.remove(s.charAt(j));
                    j++;
                }
                else
                {
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                    j++;
                }
            }
            if(map.size()==k)
            {
                max=Math.max(max,i-j+1);
            }
            i++;
        }
        return max;
    }
}
