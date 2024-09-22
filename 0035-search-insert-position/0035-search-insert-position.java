class Solution {
    public int searchInsert(int[] matrix, int target) 
    {
      
            int low=0;
            int high=matrix.length-1;
            int ans=-1;
            boolean flag=false;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(matrix[mid]==target)
                {
                    return mid;
                }
                else if(matrix[mid]>target)
                {
                    flag=true;
                    ans=mid;
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            if(flag==false)
            {
                ans=matrix.length;

            }

        
        return ans;
        
    }
}