class Solution {
    public int smallestDivisor(int[] nums, int threshold)
    {
       
        /*
        boolean loop=true;
        int k=1;
        
        while(loop)
        {
           
             int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=Math.ceil((double)(nums[i])/(double)(k));
                
            }
           
            if(sum<=threshold)
            {
                return k;
                
            }
             k++;
            
        }
        */
        int low=1;
//        int high=threshold;
       int high= findleargestnumberinaray(nums);
        System.out.println(high);
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
//            System.out.println(mid);
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=Math.ceil((double)(nums[i])/(double)(mid));

            }

            if(sum<=threshold)
            {
                ans=mid;
                high=mid-1;

            }
            else {
                low=mid+1;
            }

        }
        return ans;
    }
    private static int findleargestnumberinaray(int[] nums)
    {

        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(result<nums[i])
            {
                result=nums[i];
            }
        }
        return result;
    }

    
    }

