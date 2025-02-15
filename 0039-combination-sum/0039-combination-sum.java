class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> output=new ArrayList<>();
        findcombination(0,candidates,target,result,output);

        return result;
        
    }

    public void findcombination(int index,int [] arr,int target, List<List<Integer>> result,List<Integer> output)
    {
            //base case
            if(index==arr.length)
            {
                if(target==0)
                {
                    result.add(new ArrayList<>(output));
                }
                return;
            }

            //pick element
            // chossen part

            if(arr[index]<=target)
            {
                output.add(arr[index]);

                findcombination(index,arr,target-arr[index],result,output);

                output.remove(output.size()-1);
            }

            // not choosen part

            findcombination(index+1,arr,target,result,output);
    }
}