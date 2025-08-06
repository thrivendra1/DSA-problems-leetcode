class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numbers=new HashMap<>();
        int numbermax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(numbers.containsKey(nums[i]))
            {
                numbers.put(nums[i],numbers.get(nums[i])+1);
            }
            else
            {
                numbers.put(nums[i],1);
            }

        numbermax=Math.max(numbermax,numbers.get(nums[i]));
       
        }

       for(Map.Entry<Integer,Integer> data:numbers.entrySet())
       {
            if(data.getValue()==numbermax)
            {
                numbermax=data.getKey();
                break;
            }
       }
        return numbermax;
    }
}