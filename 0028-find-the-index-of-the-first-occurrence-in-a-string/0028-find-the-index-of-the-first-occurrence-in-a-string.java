class Solution {
    public int strStr(String haystack, String needle) 
    {
        // int start=0;
        // int end=needle.length();
        

        // String ans=finding(haystack,start,end);
        
        // if(ans.equals(needle))
        // {
        //     return start;
        // }
        
        // else
        // {
        //     start=end;
        //     end+=needle.length();
            
        // }
        

        // if(end<=haystack.length())
        // {
        //     ans=finding(haystack,start,end);
        // }

        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++)
        {
            String ans=finding(haystack,i,i+m);
            if(ans.equals(needle))
            {
                return i;
            }
        }
        return -1;
        
    }
    
    public String finding(String s,int start,int end)
    {
        String word="";
        for(int i=start;i<end;i++)
        {
            word+=s.charAt(i);
        }
        return word;
    }
}