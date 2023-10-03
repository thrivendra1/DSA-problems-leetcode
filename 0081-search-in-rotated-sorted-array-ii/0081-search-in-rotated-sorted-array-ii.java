class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        // sorting the array
        Arrays.sort(nums);
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            else if(target<nums[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return false;
    }
}