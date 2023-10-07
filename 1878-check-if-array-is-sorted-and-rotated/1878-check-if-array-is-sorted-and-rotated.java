class Solution {
    public boolean check(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > nums[(i+1)%nums.length]){
                n += 1;
            }
        }
        if(n>1)
        {
            return false;
        }
        return true;
    }
}