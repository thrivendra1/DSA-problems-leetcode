class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                count=0;;
            }
            total=Math.max(total,count);
        }
        return total;
        
    }
}