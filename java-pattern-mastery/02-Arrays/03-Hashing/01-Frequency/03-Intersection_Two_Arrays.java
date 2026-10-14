
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Intersection_Two_Arrays {

    public static void main(String[] args) {

        int nums1[] = {1, 2, 3, 2, 1};
        int nums2[] = {2, 1};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                set.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int i = 0;
        int result[] = new int[set.size()];
        for (int num : set) {
            result[i++] = num;
        }

        // Another Approach  using two sets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result1 = new int[resultSet.size()];
        int i1 = 0;

        for (int num : resultSet) {
            result1[i1++] = num;
        }

        System.out.println(Arrays.toString(result1));

        return result;

    }
}
