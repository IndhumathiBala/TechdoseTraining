class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int max=0,j=0;
        for(int i=0;i<s.length();i++)
        {
            while(j<i && set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(j));
                j++;
            }
            max=Math.max(max,i-j+1);
            set.add(s.charAt(i));
        }
        return max;
    }
}
