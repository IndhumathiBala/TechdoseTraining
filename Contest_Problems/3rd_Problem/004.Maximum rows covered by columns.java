class Solution {
    int max=0;
    public int maximumRows(int[][] mat, int cols) {
        int currCols=0;
        boolean []arr=new boolean[mat[0].length];
        pickCols(mat,cols,0,currCols,arr);
        return max;
        
    }
    void pickCols(int [][]mat,int cols,int index,int currCols,boolean visited[])
    {
        int count=0;
        boolean flag = true;
        if(index==mat[0].length)
        {
            for(int i=0;i<mat.length;i++)
            {
                flag=true;
                for(int j=0;j<mat[0].length;j++)
                {
                    if(mat[i][j]==1)
                    {
                        if(visited[j]==false)
                        {
//                             if u not pick this column so it will not be covered
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)
                    count++;
            }
            max=Math.max(count,max);
            return;
        }
        if(currCols<cols)
        {
        //pick columns
            visited[index]=true;
            pickCols(mat,cols,index+1,currCols+1,visited);
            visited[index]=false;
        }
        //not to pick the columns
        pickCols(mat,cols,index+1,currCols,visited);
    }
}
