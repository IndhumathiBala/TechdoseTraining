class Solution {
    static int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
    public boolean exist(char[][] mat, String word) {
        int m=mat.length,n=mat[0].length;
        char ch=word.charAt(0);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==ch)
                {
                   if(recur(mat,word,i,j,1,word.length()))
                   {
                        return true;
                   }
                    mat[i][j]=ch;
                }
            }
            
        }
        return false;
        
    }
    static boolean recur(char [][]mat,String s,int i,int j,int ind,int len)
    {
        int m=mat.length,n=mat[0].length;
        if(ind==len)
            return true;
        
        mat[i][j]='$';
        for(int k=0;k<dir.length;k++)
        {
           int x=i+dir[k][0],y=j+dir[k][1];
            if(x<m && x>=0 && y>=0 && y<n && mat[x][y]!='$' && mat[x][y]==s.charAt(ind))
            {
                if(recur(mat,s,x,y,ind+1,len))
                    return true;
                
                mat[x][y]=s.charAt(ind);
            }
        }
        
        return false;
       
    }
}
