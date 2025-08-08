class Solution {
    public int longestConsecutive(int[] nums) {
    /*
    // APPORACH 1: 
    // it gives correct output , but it take the TLE(Time Limit Exceeded)
        int minNumber=Integer.MAX_VALUE;
        int maxNumber=Integer.MIN_VALUE;

        HashSet<Integer> hash=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!hash.contains(nums[i]))
            {
                hash.add(nums[i]);
            }

            minNumber=Math.min(minNumber,nums[i]);
            maxNumber=Math.max(maxNumber,nums[i]);
        }
        
        int count=0;
        int maxcount=0;

        int size=0;
        for(int i=minNumber;i<=maxNumber;i++)
        {
            if(size<hash.size())
            {
                if(hash.contains(i))
                {
                    count++;
                    size++;
                }
                else
                {
                    count=0;
                }
                maxcount=Math.max(maxcount,count);
            }
            else
            {
                break;
            }
        }
        return maxcount;
        */



        //Apporach 2:

        if(nums.length==0) return 0;

        HashSet<Integer> hash=new HashSet<>();

        for(int n:nums)
        {
            hash.add(n);
        }
        int maxcount=1;

        for(int n:hash)
        {
            if(!hash.contains(n-1))
            {
                int count=1;
                int number=n;

                while(hash.contains(number+1))
                {
                    number++;
                    count++;
                }
                maxcount=Math.max(maxcount,count);
            }

        }
        return maxcount;

    }
}