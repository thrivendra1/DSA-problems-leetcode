class Solution {
    static public int findKthPositive(int[] arr, int k)
    {
      	int n=arr.length-1;
        /*
        int count=0;
        int j=0;
        for(int i=1;i<=arr[n-1];i++){
            if(count==k){
                return i-1;
            }
            if(i==arr[j]){
                j++;
            }
            else{
                count++;
            }
        }
        return n+k;
        */
        int low=0;
        int high=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high+1+k;
    }
}