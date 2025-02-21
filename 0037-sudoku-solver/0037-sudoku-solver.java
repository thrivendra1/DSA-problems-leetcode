class Solution {
    public void solveSudoku(char[][] board) 
    {
        solve(board);
        
    }

    public boolean solve(char[][]board)
    {

        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {

                if(board[row][col]=='.')
                {
                    for(char i='1';i<='9';i++)
                    {
                        if(valid(row,col,i,board))
                        {
                            board[row][col]=i;


                            if(solve(board)==true)
                            {
                                return true;
                            }
                            else
                            {
                                 board[row][col]='.';
                            }
                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public boolean valid(int row,int col,char c,char[][]board)
    {
        for(int i=0;i<9;i++)
        {
            //check row
            if(board[i][col]==c)
            {
                return false;
            }

            if(board[row][i]==c)
            {
                return false;
            }

            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3]==c)
            {
                return false;
            }
        }
        return true;
    }
}