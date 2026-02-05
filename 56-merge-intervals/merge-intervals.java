class Solution {
    public int[][] merge(int[][] intervals) {
   
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int[][] a = new int[intervals.length][2];
        int start = 0;

        // initialize first interval
        a[start][0] = intervals[0][0];
        a[start][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // ✅ correct overlap check
            if (a[start][1] >= intervals[i][0]) {
                a[start][1] = Math.max(a[start][1], intervals[i][1]);
            } 
            // no overlap
            else {
                start++;
                a[start][0] = intervals[i][0];
                a[start][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(a, start + 1);
        
    }
}