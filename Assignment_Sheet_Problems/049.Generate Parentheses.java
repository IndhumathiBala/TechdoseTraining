class Solution {
    List<String>res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
         generate(n,"",0,0);
        return res;
    }
    public void generate(int n,String st,int open,int close)
    {
        if(open==n && close==n)
        {
            res.add(st);
            return;
        }
        if(open<n)
        {
            generate(n,st+"(",open+1,close);
        }
        if(close<open)
        {
            generate(n,st+")",open,close+1);
        }
    }
}
