class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
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
    }
}