class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        if(s.length()<p.length())
            return new ArrayList<>();
        int []hash=new int[26];
        int []shash=new int [26];
        int left=0;
        for(int i=0;i<p.length();i++)
        {
            hash[p.charAt(i)-'a']++;
            shash[s.charAt(i)-'a']++; 
        }
        if(isValid(hash,shash))
            res.add(left);
        int window=p.length(),i=window,count=0;
        
        for(;i<s.length();i++)
        {
            shash[s.charAt(left)-'a']--;
            left++;
            shash[s.charAt(i)-'a']++;
            if(isValid(hash,shash))
                res.add(left);
        }
        return res;
        
    }
    static boolean isValid(int []h1,int []h2)
    {
        return Arrays.equals(h1,h2);
    }
}
