
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Insert_Interval {

    public static void main(String[] args) {

        int intervals[][] = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int newInterval[] = {4, 8};

        System.out.println(Arrays.toString(insert(intervals, newInterval)));
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        boolean added = false;

        for (int[] cur : intervals) {

            if (cur[1] < newInterval[0]) {
                result.add(cur);
            } else if (cur[0] > newInterval[1]) {
                if (!added) {
                    result.add(newInterval);
                    added = true;
                }
                result.add(cur);
            } else {
                newInterval[0] = Math.min(cur[0], newInterval[0]);
                newInterval[1] = Math.max(cur[1], newInterval[1]);
            }
        }
        if (!added) {
            result.add(newInterval);
        }

        return result.toArray(int[][]::new);
    }
}
