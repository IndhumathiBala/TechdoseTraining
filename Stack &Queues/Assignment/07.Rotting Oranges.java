//994. Rotting Oranges


class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length,fresh=0,min=-1;
        int [][]dir=new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1)
                    fresh++;
            }
        }
        if(fresh==0 )
            return 0;
        if(q.size()==0)
            return -1;
        while(q.size()>0)
        {
            min++;
            int size=q.size();
            while(size-->0)
            {
                int []a=q.poll();
                for(int []d:dir)
                {
                    int x=d[0]+a[0];
                    int y=d[1]+a[1];
                    if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1)
                    {
                        q.add(new int[]{x,y});
                        grid[x][y]=2;
                        fresh--;
                    }
                 }
            }
            
        }
        return fresh==0?min:-1;
    }
}
