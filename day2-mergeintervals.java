class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();

        int[] curr_int = intervals[0];
        list.add(curr_int);
        for (int[] interval : intervals) {
            int curr_start = curr_int[0];
            int curr_last = curr_int[1];

            int next_start = interval[0];
            int next_last = interval[1];

            if (curr_last >= next_start) {
                curr_int[1] = Math.max(curr_last, next_last);
            } else {
                curr_int = interval;
                list.add(curr_int);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}