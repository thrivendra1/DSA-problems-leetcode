class Solution {
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int number:nums)
        {
            if(map.containsKey(number))
            {
                map.put(number,map.get(number)+1);
            }
            else
            {
                map.put(number,1);
            }
        }
        int ans=-1;
        for(int N:map.keySet())
        {
            if(map.get(N)==1)
            {
                ans=N;
            }
        }
        return ans;
    }
}