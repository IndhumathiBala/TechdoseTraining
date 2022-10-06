class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        if(s.length()<p.length())
            return new ArrayList<>();
        int []hash=new int[26];
        for(char ch:p.toCharArray())
        {
            hash[ch-'a']++;
        }
        int []shash=new int [26];
        int left=0,i=0,window=p.length(),count=0;
        for(;i<window;i++)
        {
            shash[s.charAt(i)-'a']++;            
        }
        if(isValid(hash,shash))
            res.add(left);
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
        for(int i=0;i<26;i++)
        {
            if(h1[i]!=h2[i])
                return false;
        }
        return true;
    }
}
