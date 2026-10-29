
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge_Intervals {

    public static void main(String[] args) {

        int intervals[][] = {{1, 4}, {3, 6}, {2, 7}, {5, 7}};
        System.out.println(Arrays.toString(merge(intervals)));
    }

    static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 0; i < intervals.length - 1; i++) {

            int nextStart = intervals[i + 1][0];
            int nextEnd = intervals[i + 1][1];

            if (currentEnd >= nextStart) {
                currentEnd = Math.max(currentEnd, nextEnd);
            } else {
                result.add(new int[]{currentStart, currentEnd});
                currentStart = nextStart;
                currentEnd = nextEnd;
            }

        }
        result.add(new int[]{currentStart, currentEnd});

        return result.toArray(int[][]::new);

    }
}
