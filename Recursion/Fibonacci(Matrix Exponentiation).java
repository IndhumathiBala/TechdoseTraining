public class Solution {
    public int solve(int A) {
        long [][]arr={{1,1},{1,0}};
        long [][]temp=func(arr,A);
        return (int)(temp[0][1]%1000000007);
    }
    long[][]func(long [][]arr,int n)
    {
        if(n==1)
        {
            return arr;
        }
        long temp[][]=func(arr,n/2);
        if(n%2==0)
        {
            return multiply(temp,temp);
        }
        else
        {
            return multiply(temp,multiply(temp,arr));
        }
        
    }
    long [][]multiply(long a[][],long b[][])
    {
        long [][]c=new long[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c[i][j]+=((a[i][k]*b[k][j])%1000000007);
                }
            }
        }
        return c;
    }
}
