
// 2257
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][]vis=new int[m][n];
        boolean [][]v=new boolean[m][n];
        int count=0;
        for(int i[]:guards)
        {
            vis[i[0]][i[1]]=1;
        }
        for(int i[]:walls)
        {
            vis[i[0]][i[1]]=-1;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==1)
                {
                    dfs(vis,m,n,i,j);
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
    static void dfs(int [][]vis,int m,int n,int i,int j)
    {
        for(int a=i+1;a<m;a++)
        {
            if(vis[a][j]==-1 || vis[a][j]==1)
                break;
            vis[a][j]=2;
        }
        for(int a=i-1;a>=0;a--)
        {
             if(vis[a][j]==-1 || vis[a][j]==1)
                break;
            vis[a][j]=2;
        }
        for(int a=j+1;a<n;a++)
        {
             if(vis[i][a]==-1 || vis[i][a]==1)
                break;
            vis[i][a]=2;
        }
        for(int a=j-1;a>=0;a--)
        {
             if(vis[i][a]==-1 || vis[i][a]==1)
                break;
            vis[i][a]=2;
        }
    }
}
