class Solution {
    public int reverse(int x) {
        long sum=0;int flag=0;
        if(x<0)
        {
            x=x*(-1);
            flag=1;
        }
        while(x>0)
        {
            sum=sum*10+(x%10);
            x/=10;
        }
         if(flag==1)
        {
            sum=sum*(-1);
             
        }
        if(sum>=Math.pow(-2,31) && sum<=Math.pow(2,31)-1)
         {
                return (int)sum;
         }
         return 0;   
        
    }
}
