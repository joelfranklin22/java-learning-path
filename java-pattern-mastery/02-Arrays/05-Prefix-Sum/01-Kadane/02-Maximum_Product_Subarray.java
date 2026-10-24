
class Maximum_Product_Subarray {

    public static void main(String[] args) {

        int nums[] = {-2, 0, 2, -4, 2, 8};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {

        int minEnding = nums[0];
        int maxEnding = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int tempMax = Math.max(nums[i], Math.max(nums[i] * minEnding, nums[i] * maxEnding));

            minEnding = Math.min(nums[i], Math.min(nums[i] * minEnding, nums[i] * maxEnding));

            maxEnding = tempMax;

            maxProduct = Math.max(maxProduct, maxEnding);
        }
        return maxProduct;
    }
}
