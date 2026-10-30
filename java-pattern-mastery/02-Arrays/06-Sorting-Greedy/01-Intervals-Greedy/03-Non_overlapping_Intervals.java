
import java.util.Arrays;

class Non_overlapping_Intervals {

    public static void main(String[] args) {

        int intervals[][] = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};

        System.out.println(eraseOverlapIntervals(intervals));
    }

    static int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        int currentEnd = intervals[0][1];

        for (int i = 0; i < intervals.length - 1; i++) {

            int nextStart = intervals[i + 1][0];
            int nextEnd = intervals[i + 1][1];

            if (currentEnd > nextStart) {
                count++;
                currentEnd = Math.min(currentEnd, nextEnd);
            } else {
                currentEnd = nextEnd;
            }

        }
        return count;
    }
}
