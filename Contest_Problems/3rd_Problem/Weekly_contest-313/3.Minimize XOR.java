// 2429. https://leetcode.com/contest/weekly-contest-313/problems/minimize-xor/
class Solution {
     public int minimizeXor(int num1, int num2) {
        int toSet=0;
        int k=num2,ans=0;
        while(k>0)
        {
            toSet++;
            k=k&(k-1);
        }
         for(int i=31;i>=0;i--)
         {
             if(toSet==0)
                 break;
            if((num1 & (1<<i))>0)
            {
                ans|=(1<<i);
                toSet--;
             }
         }
         for(int i=0;i<32;i++)
         {
             if(toSet==0)
                 break;
             if((num1 & (1<<i))==0)
             {
                 ans|=(1<<i);
                 toSet--;
             }
         }
         return ans;
     }
}
