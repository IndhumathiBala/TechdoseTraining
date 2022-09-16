class Solution {
    public int lengthOfLongestSubstring(String s) {
     int len=s.length();
     if(len==0 || len==1)
         return len;
        
     int i=0,j=0,maxLen=0;
        Set<Character>set=new HashSet<>();
        while(j<len)
        {
            if(!(set.contains(s.charAt(j))))
            {
                set.add(s.charAt(j));
                j++;
                maxLen=Math.max(set.size(),maxLen);
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
        
    }
}
