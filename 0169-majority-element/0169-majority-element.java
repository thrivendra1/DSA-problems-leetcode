class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];
        
        for (int num=1;num<nums.length;num++) {
            if (count == 0) {
                candidate = nums[num];
               
            }
            
            if (nums[num] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}