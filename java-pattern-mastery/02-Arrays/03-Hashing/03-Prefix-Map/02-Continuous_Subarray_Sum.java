
import java.util.HashMap;

class Continuous_Subarray_Sum {

    public static void main(String[] args) {

        int nums[] = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }

    static boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (map.containsKey(remainder)) {
                int previousIndex = map.get(remainder);
                int index = i - previousIndex;
                if (index >= 2) {
                    return true;
                }
            } else {

                map.put(remainder, i);
            }
        }
        return false;
    }
}
