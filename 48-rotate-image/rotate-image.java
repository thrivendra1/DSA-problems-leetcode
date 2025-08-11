class Solution {
    public void rotate(int[][] matrix) {
        
       int m=matrix.length;
       int n=matrix[0].length;

       int [][]array=new int[m][n];

        int a=0;
       for(int i=0;i<m;i++)
       {
        int b=0;
        for(int j=n-1;j>=0;j--)
        {
            
            array[a][b]=matrix[j][i];
            System.out.println(array[a][b]);
            b++;
        }
        a++;
       }
       


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=array[i][j];
            }
            
        }
    }
}