class Solution {
    static public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums);

        List<Integer> input=new ArrayList<>();
        for(int n:nums)
        {
            input.add(n);
        }
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        uniquesubset(input,output,0,result);
        System.out.print(result);


        // Sorting by the first element

        System.out.println("----------------------");

        // // Sorting each subset in ascending order
        // for(List<Integer> subset : result) {
        //     Collections.sort(subset);
        // }

        // // Sorting the entire result based on subsets
        // result.sort((a, b) -> {
        //     for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
        //         if (!a.get(i).equals(b.get(i))) {
        //             return a.get(i) - b.get(i); // Compare elements
        //         }
        //     }
        //     return a.size() - b.size(); // If equal, smaller list first
        // });

        result=remove_duplicates(result);

        // Sorting each subset in ascending order

        System.out.print(result);
        return result;

    }

        static public List<List<Integer>> remove_duplicates(List<List<Integer>> result)
        {
            Set<List<Integer>> ans=new HashSet<>(result);
            return new ArrayList<>(ans);
        }

    static public List<List<Integer>> uniquesubset(List<Integer> input,List<Integer> output,int index,List<List<Integer>> result)
    {
        //base

        if(index>=input.size())
        {
            result.add(new ArrayList<>(output));

            return result;
        }

        //exclude
        uniquesubset(input,output,index+1,result);

        //inculde

        int element=input.get(index);
        output.add(element);
        uniquesubset(input,output,index+1,result);

        output.remove(output.size()-1);
        return result;

    }
}