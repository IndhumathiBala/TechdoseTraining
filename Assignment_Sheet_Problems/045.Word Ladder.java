class Pair
{
    String first;
    int second;
    Pair(String s,int v)
    {
        first=s;
        second=v;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
          Set<String>set=new HashSet<>();
        Queue<Pair>q=new LinkedList<>();
        for(String w:wordList)
        {
            set.add(w);
        }
        set.remove(beginWord);
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty())
        {
            Pair k=q.poll();
            String word=k.first;
            int steps=k.second;
            if(word.equals(endWord))
                return steps;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char []arr=word.toCharArray();
                    arr[i]=ch;
                    String nWord=new String(arr);
                    if(set.contains(nWord))
                    {
                        q.add(new Pair(nWord,steps+1));
                        set.remove(nWord);
                    }
                }
            }
        }
        return 0;
    }
}
