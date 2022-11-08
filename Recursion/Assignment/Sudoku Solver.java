class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char [][]board)
    {
       for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(isValid(board,i,j,ch))
                        {
                            board[i][j]=ch;
                            if(solve(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true; 
    }
    boolean isValid(char [][]mat,int i,int j,char ch)
    {
        for(int k=0;k<9;k++)
        {
            if(mat[i][k]==ch || mat[k][j]==ch || mat[3*(i/3)+k/3][3*(j/3)+k%3]==ch)
                return false;
        }
        return true;
    }
}
