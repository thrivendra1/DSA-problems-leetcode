class Solution {

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        // Calculate the minimum and maximum possible capacities
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        // Perform binary search to find the minimum capacity
        while (left < right) {
            int mid = left + (right - left) / 2;
            int currentDays = 1;
            int currentCapacity = 0;

            for (int weight : weights) {
                if (currentCapacity + weight > mid) {
                    // If the current capacity is exceeded, move to the next day
                    currentDays++;
                    currentCapacity = 0;
                }
                currentCapacity += weight;
            }

            if (currentDays <= days) {
                // If it's possible to ship in 'days' or fewer days, reduce the capacity
                right = mid;
            } else {
                // If it takes more than 'days' days, increase the capacity
                left = mid + 1;
            }
        }

        return left;
    }
}