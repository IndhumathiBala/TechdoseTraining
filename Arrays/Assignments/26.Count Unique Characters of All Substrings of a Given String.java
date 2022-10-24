class Solution {
    public int uniqueLetterString(String s) {
        List<List<Integer>>list=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<26;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<26;i++)
        {
            list.get(i).add(-1);
        }
        for(int i=0;i<n;i++)
        {
            list.get(s.charAt(i)-'A').add(i);
        }
        for(int i=0;i<26;i++)
        {
            list.get(i).add(n);
        }
        int sum=0;
        for(int i=0;i<26;i++)
        {
            for(int j=1;j<list.get(i).size()-1;j++)
            {
                
                sum+=(list.get(i).get(j)-list.get(i).get(j-1))*(list.get(i).get(j+1)-list.get(i).get(j));
            }
        }
        return sum;
    }
}
