
class Maximum_Average_Subarray_I {

    public static void main(String[] args) {

        int nums[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    static double findMaxAverage(int[] nums, int k) {

        double maxAvg = Double.NEGATIVE_INFINITY;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            if (right >= k - 1) {
                double average = (double) sum / k;
                maxAvg = Math.max(average, maxAvg);
            }
            if (right >= k - 1) {
                sum -= nums[left];
                left++;
            }
        }
        return maxAvg;
    }
}
