class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        ArrayList<Integer> input=new ArrayList<>();
        for(int num:nums)
        {
            input.add(num);
        }

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> output=new ArrayList<>();


        in_ou(input,output,result);
        return result;
        
    }

    static public void in_ou(List<Integer> input,List<Integer> output,List<List<Integer>> result)
    {
        //bs
        if(input.isEmpty())
        {
            result.add(new ArrayList<>(output));
            // System.out.println(output);
            return;
        }

        List<Integer> ou1=new ArrayList<>(output);
        List<Integer> ou2=new ArrayList<>(output);

        ou2.add(input.get(0));

        List<Integer> inputcopy=new ArrayList<>(input);

        inputcopy.remove(0);

        in_ou(inputcopy,ou1,result);
        in_ou(inputcopy,ou2,result);

    }
}