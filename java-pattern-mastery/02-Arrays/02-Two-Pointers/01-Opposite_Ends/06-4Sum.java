
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _4Sum {

    public static void main(String[] args) {

        int nums[] = {-1, 0, 2, 1, 0, -2};
        int target = 0;

        System.out.println(fourSum(nums, target));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> l1 = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;

        while (i < nums.length - 3) {
            int j = i + 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            while (j < nums.length - 2) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if (sum == target) {
                        l1.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
                j++;
            }
            i++;
        }

        return l1;
    }
}
