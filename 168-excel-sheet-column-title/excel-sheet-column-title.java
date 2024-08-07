class Solution {
    public String convertToTitle(int columnNumber) 
    {
        String letter="";
        while(columnNumber>0)
        {
            columnNumber--;
            int remainder=columnNumber%26;
             letter+=(char)(remainder+'A');
             columnNumber=columnNumber/26;

        }
        System.out.println(letter);
        return reversing(letter);
    }

    // reversing the string
    public String reversing(String s)
    {

        String ans="";

        for(int i=s.length()-1;i>=0;i--)
        {
            ans+=s.charAt(i);
        }
        return ans;
    }
}