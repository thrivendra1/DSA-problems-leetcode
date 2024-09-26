class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[]=new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse nums from right to left
        for (int i = 2*nums.length - 1; i >= 0; i--) {
            // Pop elements that are less than or equal to nums[i]
            while (!stack.isEmpty() && stack.peek() <= nums[i%nums.length]) {
                stack.pop();
            }
            if(i<nums.length)
            {
                if(stack.isEmpty()==false) result[i]=stack.peek();
                else
                {
                    result[i]=-1;
                }
            }

            // Push current element onto the stack
            stack.push(nums[i%nums.length]);
        }

    


        return result;
    }
}