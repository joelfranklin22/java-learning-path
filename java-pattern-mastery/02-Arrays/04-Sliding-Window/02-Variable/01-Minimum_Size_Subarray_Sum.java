
class Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {

        int nums[] = {2, 3, 4, 2, 6, 1, 7};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int left = 0;
        int max = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            while (sum >= target) {
                max = Math.min(max, right - left + 1);
                sum -= nums[left];
                left++;
            }

        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}
