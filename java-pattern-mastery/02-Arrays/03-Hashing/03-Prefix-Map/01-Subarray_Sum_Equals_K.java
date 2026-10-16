
import java.util.HashMap;

class Subarray_Sum_Equals_K {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 2, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }

    static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
