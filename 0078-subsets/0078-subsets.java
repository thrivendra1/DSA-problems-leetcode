class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>>  result=new ArrayList<>();
        List<Integer> subset =new ArrayList<>();

        Subsequences(0,nums,result,subset);
        return result;
        
    }

    public void Subsequences(int index,int [] arr, List<List<Integer>>  result,List<Integer> subset)
    {
        if(index==arr.length)
        {
            result.add(new ArrayList<>(subset));
            // result.add(subset);
            return;
        }

        subset.add(arr[index]);
        Subsequences(index+1,arr,result,subset);

        // removing 
        subset.remove(subset.size()-1);
        Subsequences(index+1,arr,result,subset);

    }
}