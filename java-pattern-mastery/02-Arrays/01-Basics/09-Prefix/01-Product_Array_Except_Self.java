
import java.util.Arrays;

class Product_Array_Except_Self {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {

        int answers[] = new int[nums.length];
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++) {
            answers[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answers[i] *= suffix;
            suffix *= nums[i];
        }
        return answers;
    }
}
