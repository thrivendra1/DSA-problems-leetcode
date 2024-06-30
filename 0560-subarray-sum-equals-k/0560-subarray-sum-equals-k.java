class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,1);
        int currsum=0;
        int removeSum=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            removeSum=currsum-k;

            if(prefixSum.containsKey(removeSum)){
                count+=prefixSum.get(removeSum);
            }
            prefixSum.put(currsum,prefixSum.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}