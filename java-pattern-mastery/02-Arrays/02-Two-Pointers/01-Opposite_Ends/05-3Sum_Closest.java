
import java.util.Arrays;

class Three_Sum_Closest {

    public static void main(String[] args) {

        int nums[] = {-1, 2, 1, 4};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }

    static int threeSumClosest(int[] nums, int target) {

        int i = 0;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        while (i < nums.length - 2) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int current_sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(closest - target) > Math.abs(current_sum - target)) {
                    closest = current_sum;
                }

                if (current_sum == target) {
                    return current_sum;
                } else if (current_sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
            i++;
        }
        return closest;
    }
}
