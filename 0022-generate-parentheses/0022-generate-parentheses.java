class Solution {
    public List<String> generateParenthesis(int n) 
    {   ArrayList<String> result=new ArrayList<>();
        int open=n;
        int close=n;
        String output="";
        parren( open,close,output,result);
        return result;
        
    }

    public void parren(int open,int close,String output,ArrayList<String> result)
    {
        //base case

        if(open==0 && close==0)
        {
            result.add(output);
            return;
        }

        if(open!=0)
        {
            String op1=output;
            op1+="(";
            parren(open-1,close,op1,result);
        }
        if(close>open)
        {
            String op2=output;
            op2+=")";
            parren(open,close-1,op2,result);
        }
    }
}