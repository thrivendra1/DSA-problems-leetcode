class Solution {
    public void rotate(int[][] matrix) {
        /*
        // Apporach 1
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
        */

          // Apporach 2
       int m=matrix.length;
       int n=matrix[0].length;

       for(int i=0;i<m-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(i-j!=0)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       }

       reverse(matrix);
    }

    public static void reverse(int [][]matrix)
    {
        for(int []array:matrix)
        {
            int left=0;
            int rigth=array.length-1;

            while(left<rigth)
            {
                int temp=array[left];
                array[left]=array[rigth];
                array[rigth]=temp;
                left++;
                rigth--;
            }
        }
    }
}