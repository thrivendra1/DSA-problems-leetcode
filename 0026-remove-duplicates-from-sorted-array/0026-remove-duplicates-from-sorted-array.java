class Solution {
    public int removeDuplicates(int[] nums) {
        int left=1; // it use to store the data in proper index

        for(int j=1;j<nums.length;j++)
        {   
            // we checking if the nums[j-1] number was differnet from nums[j] so it new number we can add in the left index of the nums array
            if(nums[j]!=nums[j-1])
            {
                nums[left]=nums[j];
                left++; // incraseing the index beacuse we use the index so we have move to next index
            }
            
        }
        return left;
    }
}