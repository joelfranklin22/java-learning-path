
import java.util.*;

class Running_Sum_1d {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
