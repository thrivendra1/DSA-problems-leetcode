class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> ans=new ArrayList<>();

        int n=matrix.length;  // no of rows
        int m=matrix[0].length; // no of columns
        int top=0,bottom=n-1 ,left=0,right=m-1;

        while(left<=right && top<=bottom )
        {
            // left to right
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;

            //right to bottom

            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;

            //bottom to left

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;

            //bottom to top

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
            }
            left++;

        }
        return ans;
    }
}