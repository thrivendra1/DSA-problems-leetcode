class Solution {
    public int findMin(int[] nums) {
       
       int low=0,high=nums.length-1;
       int ans=nums[0];
       while(low<=high)
       {
        int mid=low+((high-low)/2);
            if(ans>nums[mid])
            {
                ans=nums[mid];
                high=mid-1;
            }        
            else
            {
                low=mid+1;
            }
       }
       return ans;
    }
}