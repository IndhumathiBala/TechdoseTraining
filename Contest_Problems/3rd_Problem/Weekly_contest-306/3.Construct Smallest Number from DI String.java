class Solution {
    public String smallestNumber(String s) {
        StringBuilder sb=new StringBuilder(),res=new StringBuilder();
        for(int i=0;i<=s.length();i++)
        {
           
            sb.append((char)('1'+i));
            if(i==s.length() ||  s.charAt(i)=='I')
            {
                res.append(sb.reverse());
                sb=new StringBuilder();
            }
            
        }
        return res.toString();
    }
}
