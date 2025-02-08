class Solution {
    public List<String> letterCasePermutation(String input) 
    {
        HashSet<String> result=new HashSet<>();

        permu(input,"",0,result);
        // List<String> ans=new ArrayList<>(result);
        return new ArrayList<>(result);
        
    }

    static public void permu(String input,String output,int index,HashSet<String> result)
    {
        //base case

        if(index>=input.length())
        {
            result.add(output);
            return;
        }

        String op1=output;
        String op2=output;

        op1=op1+input.charAt(index);

        op2=op2+casechanging(String.valueOf(input.charAt(index)));

        permu(input,op1,index+1,result);
        permu(input,op2,index+1,result);
    }

    static public char casechanging(String n)
    {
        char c=n.charAt(0);
        if(Character.isUpperCase(c))
        {
            return Character.toLowerCase(c);
        }
        else if(Character.isLowerCase(c))
        {
            return Character.toUpperCase(c);
        }
        return c;
    }
}