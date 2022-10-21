//2222
class Solution {
    public long numberOfWays(String s) {
        long tot=s.length(),tz=0,to=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')tz++;
        }
        to=s.length()-tz;
        long cz=s.charAt(0)=='0'?1:0;
        long co=s.charAt(0)=='1'?1:0;
        long ans=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                ans+=co*(to-co);
                cz++;
            }
            else
            {
                ans+=cz*(tz-cz);
                co++;
            }
        }
        return ans;
    }
}
