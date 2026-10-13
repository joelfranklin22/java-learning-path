
import java.util.Arrays;
import java.util.HashMap;

class Intersection_Two_Arrays_II {

    public static void main(String[] args) {

        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2, 8};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        // This prb can be solved using HashMap easily
        // Method -1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // int[] result2 = new int[Math.min(nums1.length, nums2.length)];
        int k1 = 0;
        System.out.println(k1);
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                //       result2[k1++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        // return Arrays.copyOf(result2, k1);

        // Two Pointer result
        return Arrays.copyOf(result, k);

    }
}
