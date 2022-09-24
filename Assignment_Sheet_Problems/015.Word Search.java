class Solution {
    public boolean exist(char[][] mat, String word) {
        int m=mat.length,n=mat[0].length;
        char ch=word.charAt(0);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==ch)
                {
                   if(recur(mat,word,i,j,0,word.length()))
                   {
                        return true;
                   }
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
        if(i>=m || i<0 || j<0 || j>=n  || mat[i][j]!=s.charAt(ind))
            return false;
        mat[i][j]='$';
        boolean res=recur(mat,s,i+1,j,ind+1,len)||recur(mat,s,i-1,j,ind+1,len)||recur(mat,s,i,j-1,ind+1,len)||recur(mat,s,i,j+1,ind+1,len);

        mat[i][j]=s.charAt(ind);
        return res;
    }
}
