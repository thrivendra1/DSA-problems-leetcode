class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count=0;
       int total=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            total=Math.max(total,count);
        }
        return total;
    }
}