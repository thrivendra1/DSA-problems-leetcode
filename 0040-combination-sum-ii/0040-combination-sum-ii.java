class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> output=new ArrayList<>();
         Arrays.sort(candidates);

        findcombination(0,candidates,target,result,output);
        return result;
        
    }

    public void findcombination(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> output) {
        if (target == 0) {
            result.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // Skip duplicate elements
            if (i > index && arr[i] == arr[i - 1]) continue;

            // Stop recursion if the number is greater than target
            if (arr[i] > target) break;

            output.add(arr[i]);
            findcombination(i + 1, arr, target - arr[i], result, output);
            output.remove(output.size() - 1);
        }
    }
    /*public void fun(int index,int [] arr, int target, List<List<Integer>> result ,List<Integer> output)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(output));
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1]) 
            {
                continue;
            }
            if(arr[i]>target) 
            {
                break;
            }
            output.add(arr[i]);

            fun(i+1,arr,target-arr[i],result,output);

            output.remove(output.size()-1);
        }
    }
    */


}