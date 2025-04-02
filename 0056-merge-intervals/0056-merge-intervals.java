class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> result=new ArrayList<>();


        for(int []arr:intervals)
        {
            if(result.isEmpty() || result.get(result.size()-1)[1]<arr[0])
            {
                result.add(arr);
            }
            else
            {
                result.get (result.size() -1) [1] = Math.max(result.get(result.size()-1)[1],arr[1]);
            }
        }
        // Convert list to 2D array
        return result.toArray(new int[result.size()][]);
    }
}