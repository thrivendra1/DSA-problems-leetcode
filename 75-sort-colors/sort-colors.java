class Solution {
    public void sortColors(int[] nums) {
    /*   
    //    Arrays.sort(nums);
    // another approch
    int color0=0;
    int color1=0;
    int color2=0;

    

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            color0++;
        }
        if(nums[i]==1)
        {
            color1++;
        }
        if(nums[i]==2)
        {
            color2++;
        }
    }
    for(int i=0;i<color0;i++)
    {
         nums[i]=0;
    }  
    for(int i=color0;i<color0+color1;i++)
    {
        nums[i]=1;
    }     
       for(int i=color1+color0;i<color1+color2+color0;i++)
    {
        nums[i]=2;
    }   
    */

    //

    divide (nums,0,nums.length-1);
    }

    public void divide(int []num,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            // dividing left half of the array

            divide(num,start,mid);

             // dividing Right half of the array

             divide(num,mid+1,end);

             conquer(num,start,mid,end);
        }
    }

    public void conquer(int []num,int start, int mid,int end)
    {
            int n1=mid-start+1;
            int n2=end-mid;

            // taking two subarray to store the values

            int Larr[]=new int[n1];
            int Rarr[]=new int[n2];
            int n=0;

            for(int i=0;i<n1;i++)
            {
                Larr[i]=num[start+i];
                
            }

            for(int i=0;i<n2;i++)
            {
                Rarr[i]=num[mid+1+i];
                n++;
            }
            

            // merging
            int i=0,j=0;
            int k=start;

            while(i<n1 && j<n2)
            {
                if(Larr[i]<=Rarr[j])
                {
                    num[k]=Larr[i];
                    i++;
                    
                }
                else
                {
                    num[k]=Rarr[j];
                    j++;
                    
                }
                k++;
            }

            while(i<n1)
            {
                    num[k]=Larr[i];
                    i++;
                    k++;
            }

            while(j<n2)
            {
                num[k]=Rarr[j];
                    j++;
                    k++;
            }
    }
    
}