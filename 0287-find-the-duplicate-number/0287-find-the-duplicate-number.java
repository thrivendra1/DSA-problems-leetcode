class Solution {
    public int findDuplicate(int[] nums) {
        int repeated_number=-1;
        int n=nums.length;
        // this brute froce aporrach 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             repeated_number=nums[i];
        //             break;
        //         }
        //     }
        // }
        // return repeated_number;

        //---------------Better apporach----------------
        // Arrays.sort(nums);
        // for(int i=0;i<n-1;i++)
        // {
        //     if(nums[i]==nums[i+1])
        //     {
        //         repeated_number=nums[i];
        //         break;
        //     }
        // }
        // return repeated_number;


        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return nums[i];
            }
                map.put(nums[i],1);
            
        }
        return -1;
    }
}