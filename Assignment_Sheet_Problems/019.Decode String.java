class Solution {
    public String decodeString(String s) {
        int n=s.length(),a=0;
        String res="",k="";
        StringBuilder sb=new StringBuilder();
        StringBuilder sub=new StringBuilder();
        Stack <Character>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
           char ch=s.charAt(i);
           if(ch!=']')
           {
               stack.push(ch);
           }
            else
            {
                sb=new StringBuilder();
                while(!stack.isEmpty() && Character.isLetter(stack.peek()))
                {
                    sb.insert(0,stack.pop());
                }
                sub=new StringBuilder();
                stack.pop();
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                {
                    sub.insert(0,stack.pop());
                }
                int count=Integer.valueOf(sub.toString());
                String b=sb.toString();
                while(count>0)
                {
                    for(char c:b.toCharArray())
                        stack.push(c);
                    count--;
                }
            }
             
        }
        while(!stack.isEmpty())
        {
            res=stack.pop()+res;
        }
        return res;
        
    }
}
