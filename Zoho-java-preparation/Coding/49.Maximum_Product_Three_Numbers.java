import java.util.Arrays;

class Maximum_Product_Three_Numbers {
    public static void main(String[] args) {
        int nums[] = { -100, -98, -1, 2, 3, 4 };
        int n = nums.length;
        Arrays.sort(nums);
        int product_1 = nums[0] * nums[1] * nums[n - 1];
        int product_2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int max = Math.max(product_1, product_2);
        System.out.println(max);
    }
}
