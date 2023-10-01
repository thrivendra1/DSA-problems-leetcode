class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int totalsum=size*(size+1)/2;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+nums[i];
        }
        return totalsum-sum;
       
    }
}