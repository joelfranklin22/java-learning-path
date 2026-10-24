
class Maximum_Subarray {

    public static void main(String[] args) {

        int nums[] = {2, 5, 1, 5, -2, 1 - 3};

        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
