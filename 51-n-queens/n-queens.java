class Solution {
       public List<List<String>> solveNQueens(int n) 
        {
            List<List<String>> result=new ArrayList<>();
            char[][]output=new char[n][n];
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) {
                    output[i][j]='.';
                }
                
            }
            
            queen(0,n,output,result);
            System.out.println(result);
            return result;

        }

    public  void queen(int col, int n, char[][] output, List<List<String>> result)
    {

        if(col==n)
        {
            result.add(construct(output));
            return;
        }

        for(int row=0;row<n;row++)
        {
            if(issafe(row,col,output,n))
            {
                output[row][col]='Q';
                queen(col+1,n,output,result);
                output[row][col]='.';
            }
        }
    }

    public  boolean issafe(int row, int col, char[][] output,int n)
    {
        int duplicate_row=row;
        int duplicate_col=col;

        // upper diangaol
        while(row>=0 && col>=0)
        {
            if (output[row][col]=='Q') return false;
            row--;
            col--;
        }

//        middle diagoanl

        row=duplicate_row;
        col=duplicate_col;

        while (col>=0)
        {
            if (output[row][col]=='Q') return false;
            col--;

        }
        //lower diangol

        row=duplicate_row;
        col=duplicate_col;

        while (row<n && col>=0)
        {
            if (output[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }

    public  List<String> construct(char[][] output)
    {
        List<String> re=new LinkedList<>();
        for (int i = 0; i < output.length; i++) {
            String s=new String(output[i]);
            re.add(s);
        }
        return re;
    }

    }
