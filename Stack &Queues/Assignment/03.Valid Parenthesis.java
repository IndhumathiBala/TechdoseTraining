class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stack.isEmpty()&& (ch==')' || ch=='}' || ch==']'))
            {
                char c=stack.peek();
                if(ch==')' && c=='(')
                stack.pop();
                else if(ch=='}' && c=='{')
                    stack.pop();
                else if(ch==']' && c=='[')
                    stack.pop();
                else
                    stack.push(ch);
            }
            else
                stack.push(ch);
        }
        return stack.size()==0;
    }
}
