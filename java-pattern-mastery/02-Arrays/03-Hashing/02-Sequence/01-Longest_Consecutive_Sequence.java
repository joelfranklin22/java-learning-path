
import java.util.HashSet;

class Longest_Consecutive_Sequence {

    public static void main(String[] args) {

        int nums[] = {100, 4, 2, 1, 6, 87};

        System.out.println(longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                result = Math.max(result, maxCount(num, set));
            }
        }
        return result;
    }

    static int maxCount(int value, HashSet<Integer> set) {

        int count = 1;

        while (set.contains(value + 1)) {
            value++;
            count++;
        }
        return count;
    }
}
