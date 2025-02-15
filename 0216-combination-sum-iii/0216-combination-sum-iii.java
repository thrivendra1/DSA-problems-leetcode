class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        con(1,k,n,result,output);
        return result;
    }

    public void con(int index,int k,int n,List<List<Integer>> result,List<Integer> output)
    {
        if(n==0 && output.size()==k)
        {
            result.add(new ArrayList<>(output));
            return;
        }

        for(int i=index;i<=9;i++)
        {
            output.add(i);

            con(i+1,k,n-i,result,output);
            output.remove(output.size()-1);
        }
    }
}