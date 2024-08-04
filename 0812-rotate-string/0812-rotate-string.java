class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }

        if(s.equals(goal))
        {
            return true;
        }

        String ans="";

        for(int i=0;i<s.length();i++)
        {
            s=findans(s);
            if(s.equals(goal))
            {
                return true;
            }
        }
        return false;
    }

    public String findans(String s)
    {
        char firstletter=s.charAt(0);
        String ans="";
        for(int i=1;i<s.length();i++)
        {
            ans+=s.charAt(i);
        }
        ans+=String.valueOf(firstletter);
        System.out.println(ans);
        return ans;
    }
}