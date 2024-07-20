class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        // checking for then m*n is greater then the array number , beacuse if array number less then total flower we can simply retunr as -1; 
        if(m*k>bloomDay.length)
        {
            return -1;
        }

        // int min_number=findmin(bloomDay);
        // int max_number=findmax(bloomDay);
        int min_number=Integer.MAX_VALUE;
        int max_number=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            min_number=Math.min(min_number,bloomDay[i]);
            max_number=Math.max(max_number,bloomDay[i]);

        }
        // BS
        int low=min_number,high=max_number;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)==true)
            {
                high=mid-1;
                ans=mid;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }
    //finding the how many bouqet can we make
    public boolean possible(int []arr,int Z,int m,int k)
    {
        int count=0;
        int bouquets=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=Z)
            {
                count++;
            }
            else
            {
                bouquets+=(count/k);
                count=0;
            }
        }
        bouquets+=(count/k);
        return bouquets>=m;
    }

    //finding mininum number 
    public int findmin(int [] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        // System.out.print(min);
        return min;
    }
    //finding maxnumber

    public int findmax(int [] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        
        return max;
    }
}