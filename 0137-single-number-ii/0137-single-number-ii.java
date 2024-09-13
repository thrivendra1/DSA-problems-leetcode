class Solution {
    public int singleNumber(int[] nums) 
    {
        /*
        // Apporach-1 using HashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int number:nums)
        {
            if(map.containsKey(number))
            {
                map.put(number,map.get(number)+1);
            }
            else
            {
                map.put(number,1);
            }
        }
        int ans=-1;
        for(int N:map.keySet())
        {
            if(map.get(N)==1)
            {
                ans=N;
            }
        }
        return ans;
        */
        // bit manibputaion  Apporach-1
            /*
        int ans=0;
        for (int bitindex=0;bitindex<=31;bitindex++)  // Time complexity-O(31)
        {
            int count=0;
            for(int i=0;i<nums.length;i++)    // Time complexity-O(N)
            {
                int number=nums[i];
                if((nums[i]&(1<<bitindex))!=0)
                {
                    count++;
                }
            }
            if(count%3==1)
            {
                ans=ans|(1<<bitindex);
            }
        }
        return ans;
        */

        // bit manibputaion  Apporach-2  TImeComplescity-o(N)  spaceComplecity-o(1)

        int ones=0,twos=0;

        for(int i=0;i<nums.length;i++)
        {
            ones=(ones^nums[i])&~twos;
            twos=(twos^nums[i])&~ones;
        }
        return ones;
    }
}