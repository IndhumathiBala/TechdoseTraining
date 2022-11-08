class Solution {
    List<String>res=new ArrayList<>();
    Map<String,Integer>map=new HashMap<>();
    public List<String> removeInvalidParentheses(String s) {
        solve(s,countInvalid(s));
        return res;
    }
   void solve(String s,int n)
    {
        if(map.containsKey(s) && (map.get(s)>0))
            return;
        else
            map.put(s,map.getOrDefault(s,0)+1);
        if(n<0)
            return ;
        if(n==0)
        {
            if(countInvalid(s)==0)
                res.add(s);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            String l=s.substring(0,i);
            String right=s.substring(i+1);
            solve(l+right,n-1);
        }
    }
    int countInvalid(String s)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else 
                    stack.push(s.charAt(i));
            }
        }
        return stack.size();
    }
}
