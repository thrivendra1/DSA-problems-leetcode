class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max=findmax(piles);
        //use BS
        int low=0,high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int total_hours=calacutetime(piles,mid);
            if(total_hours<=h)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }

    public int findmax(int [] arr)
    {
        int max_number=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max_number=Math.max(max_number,arr[i]);
        }
        return max_number;
    }

    public int calacutetime(int []arr,int mid)
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.ceil((double)(arr[i])/(double)(mid));
        }
        return total;
    }
}