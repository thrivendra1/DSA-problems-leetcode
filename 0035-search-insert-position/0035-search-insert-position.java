class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        int index=0;

        while(start<=end)
        {
            int i=start+(end-start)/2;
            if(nums[i]==target)
            {
                return i;
            }
            else if(nums[i]>target)
            {
                    end=i-1;
            }
            else
            {
                start=i+1;
            }

        }
        return start;
        
    }
}