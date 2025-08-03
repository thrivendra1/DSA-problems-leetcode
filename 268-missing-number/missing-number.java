class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int size=nums.length;
        // // we clacute the array size to get answer
        // int total=size*(size+1)/2;
        // int sum=0;
        // for(int i=0;i<size;i++)
        // {
        //     sum=sum+nums[i];
        // }
        // return total-sum;

        if(nums.length==1 && nums[0]>0)
        {
            return nums[0]-1;
        }
         if(nums.length==1 && nums[0]==0)
         {
            return 1;
         }
        int max=Integer.MIN_VALUE;
    
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            

            set.add(nums[i]);
        }

        int count=0;
        for(int i=0;i<=max;i++)
        {
            if(set.contains(i))
            {
                count++;
            }
            else
            {
                return i;
            }
        }

        if(count==nums.length)
        {
            return max+1;
        }
       return -1;
    }
}