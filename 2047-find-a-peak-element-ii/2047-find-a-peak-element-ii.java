class Solution {
    public int[] findPeakGrid(int[][] mat) 
    {
        /*
        // brute froce 
        int maxnumber=mat[0][0];
        for(int i=0;i<mat.length;i++)
        {
            int ans=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]>ans)
                {
                    ans=mat[i][j];
                }
            }
            maxnumber=Math.max(maxnumber,ans);
        }
        for(int i=0;i<mat.length;i++)
        {
            int ans=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==maxnumber)
                {
                    return new int[]{i,j};
                }
            }
           
        }
        */
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int maxrowindex=findmaxindex(mat,n,m,mid);
            int left=mid-1>=0 ? mat[maxrowindex][mid-1]:-1;
            int right=mid+1<m ? mat[maxrowindex][mid+1]:-1;

            if(mat[maxrowindex][mid]>left && mat[maxrowindex][mid]>right)
            {
                return new int[]{maxrowindex,mid};
            }
            else if(mat[maxrowindex][mid]<left)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
       

        return new int[]{-1,-1};
    }

    public int findmaxindex(int [][]arr,int n,int m, int col)
    {
        int maxvalue=-1;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]>maxvalue)
            {
                maxvalue=arr[i][col];
                index=i;
            }
        }
        return index;
    }
}