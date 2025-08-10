class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]dupicatematrix=new int[m][n];


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dupicatematrix[i][j]=matrix[i][j];
            }
        }


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<n;k++)
                    {
                        dupicatematrix[i][k]=0;
                    }

                    for(int k=0;k<m;k++)
                    {
                        dupicatematrix[k][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix [i][j]=dupicatematrix[i][j];
            }
        }
    }
}