class Solution {
    public String minRemoveToMakeValid(String s) {
         Stack<Integer>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isAlphabetic(s.charAt(i)))
            {
                if(s.charAt(i)=='(')
                {
                    stack.push(i);
                }
                else
                {
                    if(!stack.isEmpty() && s.charAt(stack.peek())=='(')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(i);
                    }
                }
            }
        }
        StringBuilder k=new StringBuilder();
        Set<Integer>set=new HashSet<>(stack);
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(i))
                k.append(s.charAt(i));
        }
        return k.toString();
    }
}
