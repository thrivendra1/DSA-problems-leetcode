class Solution {
    public int numberOfSubstrings(String s) 
    {
        /*
        int count=0;

        for(int i=0;i<s.length();i++)
        {

            HashMap<Character,Integer> map=new HashMap<>();

            for(int j=i;j<s.length();j++)
            {
                
                map.put(s.charAt(j),1);

                if(map.size()>=3)
                {
                    // count++;
                    count+=(s.length()-j);
                    break;
                }
            }
        }
        return count;
        */

        int count=0;
        int arr[]={-1,-1,-1};

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']=i;

            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1 )
            {
                count=count+(1+ Math.min(arr[0],Math.min(arr[1],arr[2])));
            }
        }
        return count;
        
    }
}