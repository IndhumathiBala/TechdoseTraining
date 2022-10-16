// 2337. https://leetcode.com/problems/move-pieces-to-obtain-a-string/

class Solution {
    public boolean canChange(String start, String target) {
        Stack<Integer>stack=new Stack<>();
        int lcount=0,rcount=0;
        if(start.length()!=target.length())
            return false;
        for(int i=0;i<start.length();i++)
        {
            if(start.charAt(i)=='L')
                lcount++;
            else if(start.charAt(i)=='R')
                rcount++;
            if(target.charAt(i)=='L')
                lcount--;
            else if(target.charAt(i)=='R')
                rcount--;
            if(start.charAt(i)!='_')
            stack.push(i);
        }
        if(lcount!=0 ||rcount!=0)
            return false;
        for(int i=target.length()-1;i>=0;i--)
        {
            if(target.charAt(i)=='_')
                continue;
            char  ch=start.charAt(stack.peek());
            if(ch== target.charAt(i))
            {
                if((ch=='R' && stack.peek()>i)||(ch=='L' && stack.peek()<i))
                   return false;
                    
            }
           else
           {
              return false; 
           }
            stack.pop();
            
        }
        return true;
        
        
    }
}
