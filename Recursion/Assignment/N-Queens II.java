
class Solution {
    int count=0;
   public int totalNQueens(int n){
       int leftRow[]=new int[n];
       int lowerDgl[]=new int[2*n-1];
       int upperDgl[]=new int[2*n-1];
       char mat[][]=new char[n][n];
       for(int i=0;i<n;i++)
       {
           Arrays.fill(mat[i],'.');
       }
       solve(0,mat,leftRow,lowerDgl,upperDgl,n); 
       return count;
    }
    void solve(int col,char mat[][],int lR[],int lD[],int uD[],int n)
    {
        if(col==n)
        {
            count++;
            return ;
        }
        for(int row=0;row<n;row++)
        {
            if(lR[row]==0 && uD[n-1+row-col]==0 && lD[row+col]==0)
            {
                mat[row][col]='Q';
                lR[row]=1;
                uD[n-1+row-col]=1;
                lD[row+col]=1;
                solve(col+1,mat,lR,lD,uD,n);
                mat[row][col]='.';
                lR[row]=0;
                uD[n-1+row-col]=0;
                lD[row+col]=0;
                
            }
        }
    }
}
