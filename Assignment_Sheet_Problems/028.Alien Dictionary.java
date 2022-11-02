class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n=words.length;
        int []alpha=new int[26];
        for(int i=0;i<order.length();i++)
        {
            alpha[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(j>=words[i+1].length())
                    return false;
                if(words[i].charAt(j)!=words[i+1].charAt(j))
                {
                    int index=words[i].charAt(j)-'a';
                    int next=words[i+1].charAt(j)-'a';
                    if(alpha[index]>alpha[next])
                        return false;
                    else
                        break;
                }
            }
        }
        return true;
        
    }
}
