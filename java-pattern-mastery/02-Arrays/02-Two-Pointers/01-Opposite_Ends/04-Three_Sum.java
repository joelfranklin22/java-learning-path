
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Three_Sum {

    public static void main(String[] args) {

        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {

        int i = 0;
        Arrays.sort(nums);
        List<List<Integer>> l1 = new ArrayList<>();

        while (i < nums.length - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    l1.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            i++;
        }
        return l1;
    }
}
