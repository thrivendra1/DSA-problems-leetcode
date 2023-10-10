class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int count1=s.length()-1;
        // int count2=t.length()-1;

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch1=s.charAt(i);
        //     for(int j=i+1;j<s.length();j++)
        //     {
        //         char ch2=s.charAt(j);
        //         if(ch1==ch2)
        //         {
        //             count1--;
        //         }
        //     }
        // }
        // for(int i=0;i<t.length();i++)
        // {
        //     char ch1=t.charAt(i);
        //     for(int j=i+1;j<t.length();j++)
        //     {
        //         char ch2=t.charAt(j);
        //         if(ch1==ch2)
        //         {
        //             count2--;
        //         }
        //     }
        // }
        // if(count2==count1)
        // {
        //     return true;
        // }
        // else {
        //     return false;
        // }
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        if(a.length!=b.length)
        {
            return false;
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(a[i]==a[j] && b[i]!=b[j] || a[i]!=a[j] && b[i]==b[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}