class Solution {
    public String robotWithString(String s) {
        
        Stack<Character>stack=new Stack<>();''
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int arr[]=new int [n+1];
        arr[n]=127;
        for(int i=n-1;i>=0;i--)
        {
            arr[i]=(s.charAt(i)<arr[i+1])?s.charAt(i):arr[i+1];
        }
        int ind=0;
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            {
                    sb.append(stack.pop());
            }
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
