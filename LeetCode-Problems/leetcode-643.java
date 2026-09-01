class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        double sum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right + 1 >= k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[left++];
            }
        }
        return maxSum / k;
    }
}