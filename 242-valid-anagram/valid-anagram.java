class Solution {
    public boolean isAnagram(String s, String t) {
        
//         char[] schar=s.toCharArray();
//         char[] tchar=t.toCharArray();

//         Arrays.sort(schar);
//         Arrays.sort(tchar);
//         return Arrays.equals(schar,tchar);
        
       /*
        it's gives time limit excetd that why i changed new approach
       String s1=bubblesort(s);
        String s2=bubblesort(t);
        // System.out.println(s1+" "+s2);
        if(s1.equals(s2)) return true;
        return false;
    }
    
    public String bubblesort(String word)
    {
        char[] chararray=word.toCharArray();
        
        // bubble sort alogrithm was using
        
        for(int i=0;i<chararray.length-1;i++)
        {
            for(int j=0;j<chararray.length-1-i;j++)
            {
                if(chararray[j]>chararray[j+1])
                {
                    char temp=chararray[j];
                    chararray[j]=chararray[j+1];
                    chararray[j+1]=temp;
                    
                }
            }
        }
        return new String(chararray);
        */
        
        if(s.length()!=t.length()) return false;
        
        int [] count=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        
        for(int num:count)
        {
            if(num!=0) return false;
        }
        return true;
    }
}