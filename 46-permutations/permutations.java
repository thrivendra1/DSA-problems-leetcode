class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> output=new ArrayList<>();

        boolean fr[]=new boolean[nums.length];

        values(nums,result,output,fr);
        return result;
        
    }

    public void values(int []nums,List<List<Integer>> result,List<Integer> output,boolean fr[])
    {
        if(output.size()==nums.length)
        {
            result.add(new ArrayList<>(output));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!fr[i])
            {
                fr[i]=true;
                output.add(nums[i]);
                values(nums,result,output,fr);
                output.remove(output.size()-1);
                fr[i]=false;

            }
        }
    }

}