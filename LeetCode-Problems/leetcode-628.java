
// Maximum Product of Three Numbers
import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        int product_1 = nums[0] * nums[1] * nums[n - 1];

        int product_2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int max = Math.max(product_1, product_2);

        return max;

    }
}