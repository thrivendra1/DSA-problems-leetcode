class Solution {
    public int search(int[] nums, int target) {
        
        return binaryRecursion(nums,target,0,nums.length-1);
    }

    public static int binaryRecursion(int [] nums,int target,int s, int e)
    {
        if(s>e)
        {
            return -1;
        }

        int mid=s+(e-s)/2;

        if(nums[mid]==target) return mid;

        if(target<nums[mid])
        {
          return  binaryRecursion(nums,target,s,mid-1);
        }
        return  binaryRecursion(nums,target,mid+1,e);
    }
}