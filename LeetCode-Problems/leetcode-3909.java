class Solution {
    public int compareBitonicSums(int[] nums) {
        int peak = findPeak(nums);

        long leftSum = 0;
        long rightSum = 0;

        for (int i = 0; i <= peak; i++) {
            leftSum += nums[i];
        }

        for (int i = peak; i < nums.length; i++) {
            rightSum += nums[i];
        }

        if (leftSum > rightSum)
            return 0;
        if (rightSum > leftSum)
            return 1;
        return -1;
    }

    private int findPeak(int[] nums) {
        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}