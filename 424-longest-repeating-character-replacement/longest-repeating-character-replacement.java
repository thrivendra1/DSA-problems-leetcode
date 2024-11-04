class Solution {
    public int characterReplacement(String s, int k) {
        /*int maxcount=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String n="";
                n=n+s.charAt(j);
                int N=k;
                int size=n.length();
                while(size>0)
                {
                    int m=0;
                    String subarraycharacter="";
                    if(!subarraycharacter.isEmpty())
                    {
                            if(subarraycharacter.charAt(subarraycharacter.length()-1)!=n.charAt(m))
                            {
                                if(N>0)
                                {
                                    subarraycharacter=subarraycharacter+subarraycharacter.charAt(subarraycharacter.length()-1);
                                    N--;
                                }
                                m++;
                            }
                            else if(subarraycharacter.charAt(subarraycharacter.length()-1)==n.charAt(m))
                            {
                                subarraycharacter=subarraycharacter+n.charAt(m);
                                m++;
                            }
                    }
                    else
                    {
                        subarraycharacter=subarraycharacter+n.charAt(m);
                        m++;
                    }
                    maxcount=Math.max(maxcount,subarraycharacter.length()-1);
                    size--;
                }

            }
        }
        return maxcount;
        */

        int maxlen=0;

        for(int i=0;i<s.length();i++)
        {
            int [] hashchar=new int[26];
             int maxfeq=0;

            for(int j=i;j<s.length();j++)
            {
                hashchar[s.charAt(j)-'A']++;
               
                maxfeq=Math.max(maxfeq,hashchar[s.charAt(j)-'A']);

                int changes=(j-i+1)-maxfeq;

                if(changes<=k)
                {
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        return maxlen;
    }
}