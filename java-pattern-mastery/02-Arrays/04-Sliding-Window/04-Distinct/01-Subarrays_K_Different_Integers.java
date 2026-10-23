
import java.util.HashMap;

class Subarrays_K_Different_Integers {

    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println(subarraysWithKDistinct(nums, k));
    }

    static int subarraysWithKDistinct(int[] nums, int k) {

        int answer = atMost(nums, k) - atMost(nums, k - 1);
        return answer;

    }

    static int atMost(int nums[], int limit) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;

        if (limit <= 0) {
            return count;
        }

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > limit) {
                int value = nums[left];
                map.put(value, map.get(value) - 1);
                if (map.get(value) == 0) {
                    map.remove(value);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
