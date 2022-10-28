class Solution {
    public String longestDupSubstring(String S) {
        String ans="";
        int low=1,high=S.length()-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            String k=getDup(mid,S);
            if(k!=null)
            {
                ans=k;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    
    private String getDup(int size, String s){
         long pow=1;
        String ans="";
        for(int i=1;i<size;i++)
        {
            pow=pow*31;
        }
        long h=hash(s.substring(0,size));
        Set<Long>set=new HashSet<>();
        set.add(h);
        for(int i=size;i<s.length();i++)
        {
            h=nextHash(pow,h,s.charAt(i-size),s.charAt(i));
            if(!set.add(h))
            {
                return s.substring(i-size+1,i+1);
            }
            
        }
        return null;
    }
    
    private long hash(String s){
        long h=0,p=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            h+=(s.charAt(i)-'a'+1)*p;
            p*=31;
        }
        return h;
        
    }
    
    private long nextHash(long pow,long hash,char left,char right){
           return (hash-(left-'a'+1)*pow)*31+(right-'a'+1);
    }
}
