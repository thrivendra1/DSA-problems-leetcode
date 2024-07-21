class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
       /*
        if(arr.length>1)
        {
            int num=arr[0];
            int result=-1;
            for(int i=1;i<arr.length;i++)
            {
                if(num<arr[i])
                {
                    num=arr[i];
                    result=i;
                }
            }
            return result;
        }
        return arr[0];
        */
    
    if(arr.length>1)
    {
        int n=arr.length-1;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1,high=n-2;
        

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
       
    }
     return -1;
    }
}