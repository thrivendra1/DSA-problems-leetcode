class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     if(nums[i]+nums[j]==target)
        //     {
        //         return new int[]{i, j};
        //     }
        // }
        int dulpicatearray[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dulpicatearray[i]=nums[i];
        }
        sortarrray(dulpicatearray,0,dulpicatearray.length-1);

for(int a:dulpicatearray)
{
    System.out.print(a+" ");
}
        int start=0;
        int end=0;

        int left=0,right=dulpicatearray.length-1;
        while(left<right)
        {
            if(dulpicatearray[left]+dulpicatearray[right]==target)
            {
                start=dulpicatearray[left];
                end=dulpicatearray[right];
                break;
            }
            else if(dulpicatearray[left]+dulpicatearray[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        
        int startindex=-1,endindex=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(start==nums[i] && startindex==-1)
            {
                startindex=i;
            }
            else if(end==nums[i] && i!=startindex && endindex==-1)
            {
                endindex=i;
            }
        }
        

        return new int[]{startindex,endindex};
    }

    public static void sortarrray(int [] dulpicatearray,int start,int end)
    {
            if(start<end)
            {
                int mid=start+(end-start)/2;
                sortarrray(dulpicatearray,start,mid);
                sortarrray(dulpicatearray,mid+1,end);

                conqure(dulpicatearray,start,mid,end);
            }
    }

    public static void conqure(int [] array,int start,int mid,int end)
    {
        int lsize=mid-start+1;
        int rsize=end-mid;
        int larray[]=new int[lsize];
        int rarray[]=new int[rsize];
        for(int i=0;i<lsize;i++)
        {
            larray[i]=array[i+start];
        }

        for(int i=0;i<rsize;i++)
        {
            rarray[i]=array[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=start;
        while(i<lsize && j<rsize)
        {
            if(larray[i]>rarray[j])
            {
                array[k]=rarray[j];
                j++;
            }
            else
            {
                array[k]=larray[i];
                i++;
            }
            k++;
        }
        while(i<lsize)
        {
             array[k]=larray[i];
                i++;
                k++;
        }

        while(j<rsize)
        {
            array[k]=rarray[j];
                j++;
                k++;
        }
    }

}