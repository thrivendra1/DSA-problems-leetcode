class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder("");

        int openBreact=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='(')
            {
                openBreact++;
                if(openBreact>1)
                {
                    sb.append(c);
                }
            }

            else
            {
                openBreact--;

                if(openBreact>0)
                {
                    sb.append(c);
                }
            }
        }

            return sb.toString();
    }
}