
import java.util.HashMap;
import java.util.HashSet;

class Unique_Number_Occurrences {

    public static void main(String[] args) {

        int nums[] = {1, 1, 1, 2, 3, 2};
        System.out.println(uniqueOccurrences(nums));
    }

    static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
    }
}
