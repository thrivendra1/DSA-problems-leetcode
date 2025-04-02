class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if(intervals.length==0)
        {
            return mergring(intervals,newInterval);
        }

        int [][]finalintercal=mergring(intervals,newInterval);

        int[][] result = merge(finalintercal);
        return result;
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Iterate through intervals
        for (int[] interval : intervals) {
            // If the list is empty OR no overlap, add the interval
            System.out.println(interval[0]);
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping intervals: Merge by updating the end time
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert list to 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] mergring(int[][] intervals, int[] newInterval)
    {
        if (intervals.length == 0) {
            return new int[][]{newInterval}; // Fix: Directly return newInterval wrapped in a new 2D array
        }
        int [][] newarray=new int[intervals.length+1][intervals[0].length];

        for (int i = 0; i < intervals.length; i++) {
          newarray[i]=intervals[i];
        }

        newarray[intervals.length]=newInterval;

        return newarray;

    }
}