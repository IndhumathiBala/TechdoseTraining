class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String>set=new HashSet<>();
        int num=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
               if(board[i][j]!='.')
               {
                   num=board[i][j]-'0';
               if(set.contains(num+"_R_"+i) || set.contains(num+"_C_"+j) || set.contains(num+"_B_"+(i/3)+"_"+(j/3)))
                   return false;
                else
                {
                    set.add(num+"_R_"+i); //row
                    set.add(num+"_C_"+j);  //col
                    set.add(num+"_B_"+(i/3)+"_"+(j/3));  //3x3 board
                }
               }
            }
        }
        return true;
    }
}
